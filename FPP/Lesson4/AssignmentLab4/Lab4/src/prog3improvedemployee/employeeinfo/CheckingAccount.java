package prog3improvedemployee.employeeinfo;

public class CheckingAccount extends Account{

	CheckingAccount(double balance) {
		super(balance);
	}

	@Override
	public double getBalance() {
		double baseBalance = super.getBalance();
		baseBalance -= 5;
		return baseBalance;
	}
	
	@Override
	public AccountType getAcctType() {
		return AccountType.checking;
	}
	
}
