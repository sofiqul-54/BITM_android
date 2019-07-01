package javaoop;

import java.util.ArrayList;

public class MainClass {

	public static void main(String[] args) {
		
		
		
		SavingsAccount sa = 
				new SavingsAccount(5000,"SA","001",.12);
//		sa.setBankName("BITM BANK");
		
		CheckingAccount ca = 
				new CheckingAccount(10000,"CA","001",5000,100);
//		ca.setBankName("BITM BANK 2");
		
		ArrayList<Account> acs = new ArrayList<Account>();
		
		acs.add(sa);
		
		acs.add(ca);

		
		for(Account ac : acs) {
			System.out.println("Balance from " +
			ac.getClass().getSimpleName() + ": " + ac.getBalance() +
			 " in " + ac.bankName);
		}
		
		
		
		
	}

}
