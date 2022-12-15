package prog2supplement.employeeinfo;

class Account {

	AccountType acctType;
	private final static double DEFAULT_BALANCE = 0.0;
	private double balance;

	Account(AccountType acctType, double balance) {
		this.acctType = acctType;
		this.balance = balance;
	}

	Account(AccountType acctType) {
		this(acctType, DEFAULT_BALANCE);
	}

	//3. Add public accessor methods for the fields
	public double getBalance() {
		return balance;
	}

	public AccountType getAcctType() {
		return acctType;
	}

	public String toString() {
		return "\nAccount type: " + acctType + "\nCurrentBal: " + balance;
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
