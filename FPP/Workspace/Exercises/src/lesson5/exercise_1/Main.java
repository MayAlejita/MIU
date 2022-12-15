package lesson5.exercise_1;

public class Main {

	
	String managerInfo = (new Employee("Manager",1000) {
	double bonus;
	{
		bonus = .05;
	}
	int computeSalaryWithBonus() {
		return(int) ((1+bonus) * getSalary());
	}
	@Override
	public String toString() {
		return "name: " + getName() + "\n"
				+ " base salary : " + getSalary() + "\n"
				+ " bonus : " + bonus + "\n"
				+ " actual salary : " + computeSalaryWithBonus();
	}
	}).toString();

	public static void main(String[] args) {
		Main m = new Main();
		System.out.println(m.managerInfo + "\n\n");
	}

}

class Employee{
	private String name;
	private int salary;

	// constructor
	Employee(String aName, int aSalary) {
		name = aName;
		salary = aSalary;
	}

	public String getName() {
		return name;
	}

	public int getSalary() {
		return salary;
	}

}