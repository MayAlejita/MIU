package prog3improvedemployee.employeeinfo;

import java.time.LocalDate;

public class Employee {

	private AccountList accounts = new AccountList();
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
		Account checkingAcct = new CheckingAccount(startAmount);
		accounts.add(checkingAcct);
		
	}

	public void createNewSavings(double startAmount) {
		// implement
		Account savingsAcct = new SavingsAccount(startAmount);
		accounts.add(savingsAcct);		
	}

	public void createNewRetirement(double startAmount) {
		// implement
		Account retirementAcct = new RetirementAccount(startAmount);
		accounts.add(retirementAcct);		
	}

	public String getFormattedAcctInfo() {
		
		StringBuilder sb = new StringBuilder();;
		for(int i=0; i < accounts.size(); i++) {
			 
			String accountString = "";
			if(accounts.get(i) != null) {
				accountString = accounts.get(i).toString();
			}				
			sb.append(accountString).append("\n");
		}	
		return sb.toString();
	}
	
	public void deposit(int accountIndex, double amt){
		// implement
		Account selected = accounts.get(accountIndex);
		if(selected != null) {
			selected.makeDeposit(amt);
		}	
	}
	
	public boolean withdraw(int accountIndex, double amt){
		// implement
		Account selected = accounts.get(accountIndex);
		if(selected != null) {
			if(!selected.makeWithdrawal(amt)) {
				System.out.println("Insufficient funds");
				return false;
			};
			return true;
		}	
		return false;
	}
	
	public String[] getNamesOfAccounts() {
		String[] accountNames = new String[accounts.size()];
		int index = 0;
		
		for(int j=0; j< accountNames.length; j++) {
			for(int i=0; i< accounts.size(); i++) {	
				if(accounts.get(i).getAcctType().toString().equals(accountNames[j])) {
					break;
				}
				accountNames[index] = accounts.get(i).getAcctType().toString();
				if(index+1 < accountNames.length) {
					index ++;
				}
			}
		}
		return accountNames;
	}	

}
