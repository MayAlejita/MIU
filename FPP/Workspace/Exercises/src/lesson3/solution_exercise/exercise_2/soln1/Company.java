package lesson3.solution_exercise.exercise_2.soln1;

public class Company {
	private String address;
	private Employee president;
	private int numEmployees;
	public Company(String addr, Employee pres, int num) {
		address = addr;
		president = pres;
		numEmployees = num;
	}
	public String getAddress() {
		return address;
	}
	//plug security hole by returning a copy of president
	public Employee getPresident() {
		Employee temp = new Employee(president.getName(), president.getSalary());
		return temp;
	}
	public int getNumEmployees() {
		return numEmployees;
	}
}


