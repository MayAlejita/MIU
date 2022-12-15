package lesson3.solution_exercise.exercise_2.soln2;

public class Employee {
	private String name;
	private int salary;
	public Employee(String name, int salary) {
		this.name = name;
		this.salary = salary;
	}
	public String getName() {
		return name;
	}
	public int getSalary() {
		return salary;
	}
	//make Employee immutable by removing mutator
//	public void setSalary(int s) {
//		salary = s;
//	}
}



