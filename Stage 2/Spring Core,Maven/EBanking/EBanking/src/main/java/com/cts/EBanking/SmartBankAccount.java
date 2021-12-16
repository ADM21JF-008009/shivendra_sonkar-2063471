package com.cts.EBanking;

import java.text.DecimalFormat;
import java.util.List;

public class SmartBankAccount extends BankAccount{

	public SmartBankAccount(int customerId, String name, double balance, List<String> accounts) {
		super(customerId, name, balance, accounts);
	}

	@Override
	public double calculateFixedAccount(double amount, int months) {
		if(amount>9999 && amount<1000001 && months>0 && months<121) {
			double total=amount*Math.pow((1+(0.1/12)), months);
			return Double.parseDouble(new DecimalFormat(".00").format(total));
		}
		
		return -1;
	}

	@Override
	public double calculateRecurringAccount(double amount, int months) {
		if(amount>999 && amount<50001 && months>0 && months<61) {
			double total=(amount*months)+(amount*(months*(months+1)/24.0)*0.07);
			return Double.parseDouble(new DecimalFormat(".00").format(total));
		}
		
		return -1;
	}
	
}
