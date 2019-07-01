package javaoop;

public class SavingsAccount extends Account {

	private double interestRate;

	public SavingsAccount(double balance, 
			String acName, String acNo, 
			double interestRate) {
		super(balance, acName, acNo);
		this.interestRate = interestRate;
	}

	@Override
	public void withdraw(double amount) {
		double prevBal = getBalance();
		if(amount>prevBal) {
			System.out.println("Plz Add money.");
		}else {
			setBalance(getBalance() - amount);
		}
		
	}

	@Override
	public void deposit(double amount) {
		setBalance(getBalance() + amount);
	}
	
	
	
	
	
}
