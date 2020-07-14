package com.configindia;
import java.io.*;
public class Employee implements Serializable {

    private int empId;
    private String firstName;
    private String lastName;
    private int salary;

    // no argument constructor
    public Employee() {
        empId = 0;
        firstName = "";
        lastName = "";
        salary = 0;
    }

    // setters
    public void setEmpId(int eId) {
        empId = eId;
    }

    public void setFirstName(String fName) {
        firstName = fName;
    }

    public void setLastName(String lName) {
        lastName = lName;
    }

    public void setSalary(int sal) {
        salary = sal;
    }

    // getters
    public int getEmpId() {
        return empId;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public int getSalary() {
        return salary;
    }
}
