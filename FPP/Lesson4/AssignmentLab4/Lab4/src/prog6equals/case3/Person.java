package prog6equals.case3;

import java.util.GregorianCalendar;

public class Person {

	private String name;
	private GregorianCalendar dateOfBirth;
	Person(String name, GregorianCalendar dob) {
		this.name = name;
		dateOfBirth = dob;
	}
	public String getName() {
		return name;
	}
	
	public GregorianCalendar getDateOfBirth() {
		return (GregorianCalendar)dateOfBirth.clone();
	}
	
	public boolean equals(Object ob) {
		if(ob == null) return false;
		if(!(ob instanceof Person)) return false;
		Person p = (Person)ob;
		return p.name.equals(name) && p.dateOfBirth.equals(dateOfBirth);
	}
	
	public int hashCode() {
		int seed = 17;
		int result = 31 * seed + name.hashCode();
		result = 31 * result + dateOfBirth.hashCode();
		return result;
	}
	
	public static void main(String[] args) {
		
		GregorianCalendar dob= new GregorianCalendar(2022, 12, 5);
		PersonWithJob joe1 = new PersonWithJob("Joe", dob, 10000); 
		PersonWithJob joe2 = new PersonWithJob("Joe", dob, 50000); 
		PersonWithJob joe3 = new PersonWithJob("Joe", dob, 50000); 
		boolean areTheyEqual = joe1.equals(joe2);
		boolean areTheyEqual1 = joe2.equals(joe1);
		
		System.out.println(areTheyEqual);
		System.out.println(areTheyEqual1);
		System.out.println(joe2.equals(joe3));

	}

}
