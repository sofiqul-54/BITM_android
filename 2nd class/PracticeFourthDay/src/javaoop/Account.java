package javaoop;

public abstract class Account {

	private double balance;
	private String acName;
	public static final String bankName = "BITM PUBLIC BANK";
	private String acNo;
	
	public Account() {
		
	}
	
	public Account(double balance, 
			String acName, String acNo) {
		this.balance = balance;
		this.acName = acName;
		this.acNo = acNo;
	}
	


	public abstract void withdraw(double amount);
	
	public abstract void deposit(double amount);
	
	
	public double getBalance() {
		return balance;
	}
	public void setBalance(double balance) {
		this.balance = balance;
	}
	public String getAcName() {
		return acName;
	}
	public void setAcName(String acName) {
		this.acName = acName;
	}
	public String getAcNo() {
		return acNo;
	}
	public void setAcNo(String acNo) {
		this.acNo = acNo;
	}
	
	
}
