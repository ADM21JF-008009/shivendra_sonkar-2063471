package com.app.driver;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.spring.app.EmployeeDAO;

public class Main {
 
	@SuppressWarnings("resource")
	public static void main(String[] args) {
    ApplicationContext context=new ClassPathXmlApplicationContext("beans.xml");
    EmployeeDAO dao=context.getBean("EmployeeDAO",EmployeeDAO.class);
    System.out.println(dao.getDbConfig().getDriverName());
    System.out.println(dao.getDbConfig().getUrl());
    System.out.println(dao.getDbConfig().getUserName());
    System.out.println(dao.getDbConfig().getPassword());
 	}
}