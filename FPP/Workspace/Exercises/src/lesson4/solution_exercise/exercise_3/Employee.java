package lesson4.solution_exercise.exercise_3;

import java.lang.reflect.InvocationTargetException;

public class Employee {
	private String name;
	private int salary;
	public Employee() {
		//creates an Employee shell
	}
	public String getName() {
		return name;
	}
	public int getSalary() {
		return salary;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	public void setSalary(int sal) {
		this.salary = sal;
	}
	
	@Override
	public String toString() {
		return name + ": " + salary;
	}
	
	public static void main(String[] args) throws ClassNotFoundException, InstantiationException, IllegalAccessException, IllegalArgumentException, InvocationTargetException, NoSuchMethodException, SecurityException {
		String className = "Employee";
		Class<?> empClass = Class.forName(className);
		Employee emp = (Employee)empClass.getDeclaredConstructor().newInstance();
		emp.setName("Bob");
		emp.setSalary(85000);
		System.out.println(emp);
	}
}


