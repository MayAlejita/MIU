package prog1department;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Professor emp1 = new Professor("Bob", 5000.00, 2022, 12, 4);
		emp1.setNumberOfPublications(10);
		Professor emp2 = new Professor("Ralph", 5000.00, 2022, 12, 4);
		emp2.setNumberOfPublications(10);
		Professor emp3 = new Professor("Ana", 5000.00, 2022, 12, 4);
		emp3.setNumberOfPublications(10);
		Secretary emp4 = new Secretary("Rebeca", 5000.00, 2022, 11, 14);
		emp4.setOverTimeHours(200);
		Secretary emp5 = new Secretary("Cecilia", 5000.00, 2022, 10, 24);
		emp5.setOverTimeHours(200);
		DeptEmployee[] department = {emp1, emp2, emp3, emp4, emp5};
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Do you wish to see the sum of all salaries (Y/N): ");
		String response = sc.next();
		
		if(response.equalsIgnoreCase("Y")) {
			double sum = 0;
			for(DeptEmployee emp : department) {
				sum += emp.computeSalary();
			}
			System.out.printf("The sum of all salaries is: %.2f", sum);
		}
		
		sc.close();
				
	}

}
