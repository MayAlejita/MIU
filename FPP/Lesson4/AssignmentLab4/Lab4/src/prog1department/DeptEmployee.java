package prog1department;

import java.time.LocalDate;

public class DeptEmployee {
	private String name;
	protected double salary;
	private LocalDate hireDate;
	
	public DeptEmployee(String name, double salary, int year, int month, int day) {
		this.name = name;
		this.salary = salary;
		this.hireDate = LocalDate.of(year, month, day);
	}

	public String getName() {
		return name;
	}

	public LocalDate getHireDate() {
		return hireDate;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setHireDate(LocalDate hireDate) {
		this.hireDate = hireDate;
	}
	
	public double computeSalary() {
		return salary;
	}
	
}
