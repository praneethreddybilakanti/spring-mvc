package com.praneeth.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.ViewControllerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurationSupport;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;
import org.springframework.web.servlet.view.InternalResourceViewResolver;

import com.praneeth.interceptor.AdminInterceptor;
import com.praneeth.interceptor.GuestInterceptor;
@Configuration
@EnableWebMvc
@ComponentScan(basePackages = { "com.praneeth.controller" })

public class WebConfig extends WebMvcConfigurerAdapter {


	@Override
	public void addInterceptors(InterceptorRegistry registry) {
		// TODO Auto-generated method stub

	      // Register guest interceptor with single path pattern
	      registry.addInterceptor(new GuestInterceptor()).addPathPatterns("/guest");

	      // Register admin interceptor with multiple path patterns
	      registry.addInterceptor(new AdminInterceptor())
	              .addPathPatterns(new String[] { "/admin", "/admin/*" });
	
	
	}
	
	@Bean
	   public InternalResourceViewResolver resolver() {
		      InternalResourceViewResolver resolver = new InternalResourceViewResolver();
		      resolver.setPrefix("/WEB-INF/views/");
		      resolver.setSuffix(".jsp");
		      return resolver;

	}
}
