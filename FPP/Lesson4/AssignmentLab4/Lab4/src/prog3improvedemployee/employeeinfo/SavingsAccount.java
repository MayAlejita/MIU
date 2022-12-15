package prog3improvedemployee.employeeinfo;

public class SavingsAccount extends Account{

	private static final double INTEREST = 0.25;
	SavingsAccount(double balance) {
		super(balance);
	}

	@Override
	public double getBalance() {
		double baseBalance = super.getBalance();
		double interest = (INTEREST/100) * baseBalance;
		return baseBalance + interest;
	}
	
	@Override
	public AccountType getAcctType() {
		return AccountType.savings;
	}
}
