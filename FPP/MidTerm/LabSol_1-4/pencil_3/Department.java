package pencil_3;

public class Department {
	public double ComputeSalary(Employee emp) {
		//Assume the methods used here really exist
		String status = emp.getStatus();
		double baseSalary = lookupBaseSalary(status);
		double bonus = lookupBonus(emp);

		return baseSalary + bonus;
	}	
	
	//Auxiliary methods
	public double lookupBaseSalary(String status) {
		return 0.00;
	}
	public double lookupBonus(Employee emp) {
		return 0.00;
	}
}

