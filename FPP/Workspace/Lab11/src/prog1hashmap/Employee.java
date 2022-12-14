package prog1hashmap;

import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;

public class Employee {
	private String firstName;
	private String lastName;
	private HashMap<String, Double> salaryRecord;
	
	Employee (){
		salaryRecord = new HashMap<String, Double>();
	}
	public void addEntry(String date, double salary) {
		//implement		
		salaryRecord.put(date, salary);	
	}
	
	public void printPaymentAmount(String date) {
		//implement
		Double salary = salaryRecord.get(date);
		StringBuilder sb = new StringBuilder();
		
		if(salary != null) {		
			sb.append(firstName).append(" ").append(lastName).append(" was paid ").append(salary).append(" on ").append(date);	
			System.out.println(sb.toString());
		}
		else {
			sb.append(firstName).append(" ").append(lastName).append(" did not receive a paycheck on ").append(date);
			System.out.println(sb.toString());
		}
		
		
	}
	public void printAveragePaycheck() {
		//implement
		Double total = 0.0;		
		Collection<Double> salaries = salaryRecord.values();
		
		for (Double a : salaries) {
			total += a;	
		}
		
		total = total/salaries.size();
		System.out.println("Average paycheck for " + firstName + " " + lastName + " was " + total);	
	}
	
	
	@Override
	public String toString() {
		return "Employee [firstName=" + firstName + ", lastName=" + lastName + ", salaryRecord=" + salaryRecord + "]";
	}

	public static void main(String[] args) {
		Employee e = new Employee();
		e.setFirstName("Jim");
		e.setLastName("Jones");
		for(int i = 1; i <= 12; ++i) {
			e.addEntry(i+"/15/2011", 3070+5*i);
		}
		
		e.printPaymentAmount("3/15/2011");
		e.printPaymentAmount("5/15/2010");
		e.printAveragePaycheck();
		
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

}
