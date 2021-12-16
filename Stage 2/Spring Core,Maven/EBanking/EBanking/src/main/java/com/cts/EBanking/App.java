package com.cts.EBanking;

import java.text.DecimalFormat;
import java.util.Scanner;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class App {
	public static void main(String[] args) {
		// CODE SKELETON - VALIDATION STARTS
		// DO NOT CHANGE THIS CODE

		new SkeletonValidator();

		// CODE SKELETON - VALIDATION ENDS

		// Please start your code from here
		//Configuration and Input data read here
		//Refer sample input details
		DecimalFormat format=new DecimalFormat(".00");
		Scanner scanner = new Scanner(System.in);		
		ConfigurableApplicationContext context=new ClassPathXmlApplicationContext("spring.xml");
		SmartBankAccount bank=(SmartBankAccount) context.getBean("smartBankAccount");
		System.out.println("Welcome Mr/Ms: "+bank.getName());
		System.out.println("Your customer id is :"+bank.getCustomerId());
		System.out.println("Please select account type \n1 "+bank.getAccounts().get(0)+" \n2 "+ bank.getAccounts().get(1)+" \n3 "+bank.getAccounts().get(2));
		switch (scanner.nextInt()) {
		case 1:
			System.out.println("Select transaction type \n 1.Deposit \n 2.Withdraw");
			int choice = scanner.nextInt();
			if (choice == 1) {
				System.out.println("Enter amount to be deposited");
				double dep=scanner.nextDouble();
				bank.doDeposit(dep);
				System.out.println("Your balance amount is "+bank.getBalance());
			} else if (choice == 2) {
				//Do call Withdraw				
				System.out.println("Enter amount to be withdrawn");
				double with=scanner.nextDouble();
				bank.doWithdraw(with);
				System.out.println("Your balance amount is "+bank.getBalance());
			} else {
				System.out.println("Wrong choice");
			}
			break;
		case 2:
			//Code for recurringAccount
		      System.out.println("Enter monthly installment");
		      double amount=scanner.nextDouble();
		      System.out.println("Enter tenure in months");
		      int month=scanner.nextInt();
		      System.out.println("Your balance after "+month+" months will be "+format.format(bank.calculateRecurringAccount(amount, month)));
			break;
		case 3:
			//Code for FD
			System.out.println("Enter FD amount");
			amount=scanner.nextDouble();
			System.out.println("Enter tenure in months");
			month=scanner.nextInt();
			System.out.println("Your balance after "+month+" months will be "+format.format(bank.calculateFixedAccount(amount, month)));
			break;
		default:
			System.out.println("Wrong Choice");

		}
	}
}
