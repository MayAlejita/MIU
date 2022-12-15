package prog1department;

public class Secretary extends DeptEmployee{
	
	private double overTimeHours;

	public Secretary(String name, double salary, int year, int month, int day) {
		super(name, salary, year, month, day);
	}

	public double getOverTimeHours() {
		return overTimeHours;
	}

	public void setOverTimeHours(double overTimeHours) {
		this.overTimeHours = overTimeHours;
	}
	
	@Override
	public double computeSalary() {	
		return salary + (12 * overTimeHours);
	}

}
