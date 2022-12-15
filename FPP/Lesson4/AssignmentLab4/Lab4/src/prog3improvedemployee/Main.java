package prog3improvedemployee;
import java.util.Scanner;

import prog3improvedemployee.employeeinfo.Employee;

public class Main {
	
	Employee[] emps = null;
	public static void main(String[] args) {
		
		new Main();
	}
	
	Main(){
		emps = new Employee[3];
		emps[0] = new Employee("Jim Daley", 2000, 9, 4);
		emps[1] = new Employee("Bob Reuben", 1998, 1, 5);
		emps[2] = new Employee("Susan Randolph", 1997, 2,13);
		
		emps[0].createNewChecking(10500);
		emps[0].createNewSavings(1000);
		emps[0].createNewRetirement(9300);
		emps[1].createNewChecking(34000);
		emps[1].createNewSavings(27000);
		emps[2].createNewChecking(10038);
		emps[2].createNewSavings(12600);
		emps[2].createNewRetirement(9000);	
		
				
		Scanner sc = new Scanner(System.in);
		System.out.println("A. See a report of all accounts.");
		System.out.println("B. Make a deposit.");
		System.out.println("C. Make a withdrawal.");
		System.out.println("Make a selection (A/B/C): ");
		String answer = sc.next();
		
		if(answer.equalsIgnoreCase("A")){
			String info = getFormattedAccountInfo();
			System.out.println(info);
		}
		else if(answer.equalsIgnoreCase("B")){
			for(int i=0; i< emps.length; i++) {
				System.out.println(i + ". "+ emps[i].getName());
			}
			System.out.println("Select an employee: (type a number) ");
			
			int option = sc.nextInt();
			String[] accountNames = emps[option].getNamesOfAccounts();
			
			for(int i=0; i< accountNames.length; i++) {
				System.out.println(i + ". "+ accountNames[i]);
			}
			
			System.out.println("Select an account: (type a number) ");
			int optionAccount = sc.nextInt();
					
			System.out.println("Deposit Amount: ");
			double optionAmount = sc.nextDouble();
			
			emps[option].deposit(optionAccount, optionAmount);
			
			StringBuilder sb = new StringBuilder();
			sb.append(optionAmount).append(" has been deposited in the ").
			append(accountNames[optionAccount]).append(" account of ").append(emps[option].getName());
			
			System.out.println(sb.toString());							
		}
		else if(answer.equalsIgnoreCase("C")){
			
			for(int i=0; i< emps.length; i++) {
				System.out.println(i + ". "+ emps[i].getName());
			}
			System.out.println("Select an employee: (type a number) ");
			
			int option = sc.nextInt();
			String[] accountNames = emps[option].getNamesOfAccounts();
			
			for(int i=0; i< accountNames.length; i++) {
				System.out.println(i + ". "+ accountNames[i]);
			}
			
			System.out.println("Select an account: (type a number) ");
			int optionAccount = sc.nextInt();
					
			System.out.println("Withdrawal Amount: ");
			double optionAmount = sc.nextDouble();
			
			if(emps[option].withdraw(optionAccount, optionAmount)) {
				StringBuilder sb = new StringBuilder();
				sb.append(optionAmount).append(" has been withdrawn of the ").
				append(accountNames[optionAccount]).append(" account of ").append(emps[option].getName());
				
				System.out.println(sb.toString());	
			}
						
		}
		sc.close();
	}
	
	String getFormattedAccountInfo(){
		//loop through employees array and get formatted
		//account info for each employee, and assemble into a string
		StringBuilder sb = new StringBuilder();
		for(Employee emp: emps) {
			sb.append("\nACCOUNT INFO FOR ").append(emp.getName()).append(emp.getFormattedAcctInfo());
		}
		return sb.toString();
	}
}
