package lesson4.solution_exercise.exercise_5.nested;

import java.util.Date;
import java.util.GregorianCalendar;

public class Employee {
	// instance fields
	private String name; 
	private String nickName;
	private double salary;



	// instance methods
	public String getName() {
		return name;
	}
	public String getNickName() {
		return nickName;
	}
	public void setNickName(String aNickName) {
		nickName = aNickName;
	}
	public double getSalary() {
		return salary;
	}
	// needs to be improved

	//From Advanced Employee example
	public void raiseSalary(double byPercent) {
		double raise = salary * byPercent / 100;
		salary += raise;
	}
}
