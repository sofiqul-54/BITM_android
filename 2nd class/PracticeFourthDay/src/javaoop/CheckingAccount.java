package javaoop;

public class CheckingAccount extends Account {
	
	private double maxAmount;
	private double serviceCharge;
	public CheckingAccount(double balance, 
			String acName, String acNo, 
			double maxAmount, double serviceCharge) {
		super(balance, acName, acNo);
		this.maxAmount = maxAmount;
		this.serviceCharge = serviceCharge;
	}
	

	@Override
	public void withdraw(double amount) {
		
		double prevBal = getBalance();
		
		if(amount - prevBal > maxAmount) {
			System.out.println("Exceeds max amount");
		}else {
			setBalance(getBalance() - amount);
		}
		
	}

	@Override
	public void deposit(double amount) {
		setBalance(getBalance() + amount);
	}
	
	
	

}
