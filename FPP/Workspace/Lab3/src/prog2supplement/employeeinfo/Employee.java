package prog2supplement.employeeinfo;

import java.time.LocalDate;

public class Employee {

	private Account savingsAcct;
	private Account checkingAcct;
	private Account retirementAcct;
	private String name;
	private LocalDate hireDate;
	
	public Employee(String name, int yearOfHire, int monthOfHire, int dayOfHire){
		this.name = name;
		
		//update, using LocalDate
		hireDate = LocalDate.of(yearOfHire, monthOfHire, dayOfHire);
	}
	
	public String getName() {
		return name;
	}


	public LocalDate getHireDate() {
		return hireDate;
	}

	public void createNewChecking(double startAmount) {
		// implement
		checkingAcct = new Account(AccountType.checking, startAmount);
		
	}

	public void createNewSavings(double startAmount) {
		// implement
		savingsAcct = new Account(AccountType.savings, startAmount);
		
	}

	public void createNewRetirement(double startAmount) {
		// implement
		retirementAcct = new Account(AccountType.retirement, startAmount);
		
	}

	public String getFormattedAcctInfo() {
		
		String retirementString = "";
		if(retirementAcct != null) {
			retirementString = retirementAcct.toString();
		}
		
		// implement
		return "\nACCOUNT INFO FOR " + name + ": \n" + 
		checkingAcct.toString() + savingsAcct.toString() + retirementString + "\n";
	}
	
	public void deposit(String acctType, double amt){
		// implement
		savingsAcct.makeDeposit(amt);
	}
	
	public boolean withdraw(String acctType, double amt){
		// implement
		return retirementAcct.makeWithdrawal(amt);
	}

}
