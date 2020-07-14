package com.configindia;
import java.util.*;
import java.sql.*;
public class EmployeeDAO 
{
private Connection con;
public EmployeeDAO() throws ClassNotFoundException,SQLException{
establishConnection();
}
 //method used to establish connection with database
private void establishConnection() throws ClassNotFoundException, SQLException {
Class.forName("oracle.jdbc.driver.OracleDriver");
con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE","system","system");
}

 /* used to search the employee against first name and returns the ArrayList
   that contains only those EmployeeInfo objects which matches the search criteria
   */
    public ArrayList retrieveEmployeesList(String fname) throws SQLException {
       
		ArrayList empList = new ArrayList();

        String sql = " SELECT * FROM employees WHERE first_name = ?";
        PreparedStatement pst = con.prepareStatement(sql);
        pst.setString(1, fname);

        ResultSet rs = pst.executeQuery();

        int empId;
        String firstName;
        String lastName;
        int sal;

        while (rs.next()) {
            empId = rs.getInt("emp_id");
            firstName = rs.getString("first_name");
            lastName = rs.getString("last_name");
            sal = rs.getInt("salary");

            // creating a Employee object
            Employee e = new Employee();
            e.setEmpId(empId);
            e.setFirstName(firstName);
            e.setLastName(lastName);
            e.setSalary(sal);
            // adding a bean to arraylist
            empList.add(e);
        }
        return empList;
    }

//this method accepts an object of Employee, and stores it into the database
    public void addEmployee(Employee e) throws SQLException {
        String sql = " INSERT INTO employees VALUES (?, ?, ?, ?)";
        PreparedStatement pst = con.prepareStatement(sql);
        int empId = e.getEmpId();
        String fName = e.getFirstName();
        String lName = e.getLastName();
        int sal = e.getSalary();

        pst.setInt(1,empId);
        pst.setString(2,fName);
        pst.setString(3,lName);
        pst.setInt(4,sal);
        pst.executeUpdate();
    }
    // overriding finalize method to release acquired resources
    public void finalize() {
        try {
            if (con != null) {
                con.close();
            }
        } catch (SQLException sqlex) {
            System.out.println(sqlex);
        }
    }
}
