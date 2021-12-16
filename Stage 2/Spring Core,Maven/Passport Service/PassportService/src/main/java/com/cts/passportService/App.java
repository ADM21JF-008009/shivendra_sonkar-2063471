package com.cts.passportService;

import java.util.Scanner;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App 
{
    public static void main( String[] args )
    {
    	new SkeletonValidator();
    	
    	ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
    	HeadPassportOffice passport=null;
    	Scanner scanner=new Scanner(System.in);
    	
    	System.out.println("Select location:\n1.Chennai\n2.Bangalore");
    	int choice=scanner.nextInt();
    	
    	if(choice==1){
    		passport=(HeadPassportOffice) context.getBean(ChennaiPassportOffice.class);
    		// Type your code here
    	}else if(choice==2){
    		// Type your code here
    		passport=(BangalorePassportOffice)context.getBean(BangalorePassportOffice.class);
    	}else{
    		System.out.println("Wrong Choice");
    		return;
    	}
    	passport.doPhotoVerification();
    	passport.issuePassport();
    	
    	
    }
}
