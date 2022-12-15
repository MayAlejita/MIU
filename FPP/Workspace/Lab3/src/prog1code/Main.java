package prog1code;

public class Main {

	public static void main(String[] args) {
		
		Employee employee = new Employee("Mayra", "Ale", 1000, 2022, 12, 1);
		Account accountChecking = new Account(employee, AccountType.CHECKING, 300);
		Account accountSaving = new Account(employee, AccountType.SAVINGS, 300);
		Account accountRetirement = new Account(employee, AccountType.RETIREMENT, 300);
		
		System.out.println(accountChecking.toString());
		System.out.println(accountSaving.toString());
		System.out.println(accountRetirement.toString());

	}

}
