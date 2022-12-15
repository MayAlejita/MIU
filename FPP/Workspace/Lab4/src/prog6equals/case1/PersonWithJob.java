package prog6equals.case1;

import java.util.GregorianCalendar;

public class PersonWithJob extends Person {
	private double salary;
	PersonWithJob(String name, GregorianCalendar dob, double salary) {
		super(name, dob);
		this.salary = salary;
	}
	public double getSalary() {
		return salary;
	}
	
	@Override
	public boolean equals(Object ob) {
		if(ob == null) {
			return false;
		}
		if(!(ob instanceof Person)) {
			return false;
		}
		PersonWithJob p = (PersonWithJob)ob;
		boolean isEqual = getName().equals(p.getName()) && getDateOfBirth().equals(p.getDateOfBirth());
		return isEqual;
	}
}
