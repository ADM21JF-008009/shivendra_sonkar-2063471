package com.spring.ui;
import com.spring.app.AddressBook;
import java.util.Scanner;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Driver {
	
	
	public static AddressBook loadAddressBook()
	{
 ApplicationContext context=new ClassPathXmlApplicationContext("applicationContext.xml");
		return context.getBean("addressBook",AddressBook.class);
	}
	
	public static void main(String[] args)
	{
		//invoke the loadAddressBook() method from main retrieve the AddressBook object, get the details from the user set the values and display the values
Scanner sc=new Scanner(System.in);
       AddressBook address=loadAddressBook();
       System.out.println("Enter the temporary address");
       System.out.println("Enter the house name");
       String name=sc.nextLine();
       System.out.println("Enter the street");
       String street=sc.nextLine();
       System.out.println("Enter the city");
       String city=sc.nextLine();
       System.out.println("Enter the state");
       String state=sc.nextLine().trim();
       System.out.println("Enter the phone number");
       String phone=sc.nextLine();
       address.setPhoneNumber(phone);
       address.getTempAddress().setHouseName(name);
       address.getTempAddress().setCity(city);
       address.getTempAddress().setStreet(street);
       address.getTempAddress().setState(state);
       System.out.println("Temporary address");
       System.out.println("House name:"+address.getTempAddress().getHouseName());
       System.out.println("Street:"+address.getTempAddress().getStreet());
       System.out.println("City:"+address.getTempAddress().getCity());
       System.out.println("State:"+address.getTempAddress().getState());
       System.out.println("Phone number :"+address.getPhoneNumber());
	}

}
