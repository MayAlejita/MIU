package prog3improvedemployee.employeeinfo;

class Account {

	AccountType acctType;
	private final static double DEFAULT_BALANCE = 0.0;
	protected double balance;

	Account(double balance) {
		this.balance = balance;
	}

	Account() {
		this(DEFAULT_BALANCE);
	}

	public double getBalance() {
		return balance;
	}

	public AccountType getAcctType() {
		return acctType;
	}

	public String toString() {
		return "\nAccount type: " + getAcctType() + "\nCurrentBal: " + getBalance() ;
	}

	//2. Add the following methods 
	public void makeDeposit(double deposit) {
		balance += deposit;
	}

	public boolean makeWithdrawal(double amount) {
		if(amount > balance) {
			return false;
		}
		balance -= amount;
		return true;
	}
	
}
