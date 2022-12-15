package prog6equals.case3;

import java.util.GregorianCalendar;

public class PersonWithJob{
	private double salary;
	Person person;
	
	PersonWithJob(String name, GregorianCalendar dob, double salary) {
		person = new Person(name, dob);
		this.salary = salary;
	}
	public double getSalary() {
		return salary;
	}
	
	@Override
	public final boolean equals(Object withJob) {
		if (withJob == null) {
			return false;
		}			
		if (withJob.getClass() != this.getClass()) {
			return false;
		}		
		PersonWithJob p = (PersonWithJob) withJob;
		boolean isEqual = p.person.equals(person) && p.salary == salary;
		return isEqual;
	}
}
