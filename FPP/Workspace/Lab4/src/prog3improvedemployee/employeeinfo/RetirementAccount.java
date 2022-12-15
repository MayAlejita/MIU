package prog3improvedemployee.employeeinfo;

public class RetirementAccount extends Account{

	RetirementAccount(double balance) {
		super(balance);
	}

	@Override
	public boolean makeWithdrawal(double amount) {
		if(amount > balance) {
			return false;
		}
		balance -= amount;
		balance = balance - (2 * balance)/100;
		return true;
	}
	
	@Override
	public AccountType getAcctType() {
		return AccountType.retirement;
	}
}
