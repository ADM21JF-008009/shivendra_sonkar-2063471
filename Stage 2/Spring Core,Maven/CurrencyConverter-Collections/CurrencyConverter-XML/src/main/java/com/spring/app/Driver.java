package com.spring.app;

import java.util.Scanner;

import javax.naming.Context;

import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Driver {

public static void main(String[] args)
{
Scanner sc=new Scanner(System.in);
String str=sc.next();
ConfigurableApplicationContext context=new ClassPathXmlApplicationContext("beans.xml");
CurrencyConverter curr=context.getBean("currencyconverter",CurrencyConverter.class);
	System.out.println(curr.getTotalCurrencyValue(str));
	context.close();
	
}
}
