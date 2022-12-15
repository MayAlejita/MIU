package lesson3.solution_exercise.exercise_4;

public class CallByValue {
	Employee e1 = new Employee("Tom", 100000);
	Employee e2 = new Employee("Bob", 80000); 
	
	public void change1(Employee x, Employee y) {
		int s = y.getSalary();
		y.setSalary(x.getSalary());
		x.setSalary(s);
	}
	
	public void change2(Employee x, Employee y) {
		y = x;
	}
	
	public void change3(Employee x, Employee y) {
		 e1 = y;
		 e2 = x;
	}
	
	public static void main(String[] args) {
		CallByValue cbv = new CallByValue();
		System.out.println("Before all calls:  Employee e1: " + cbv.e1 + "  Employee e2: " + cbv.e2);
		
		//cbv.change1(cbv.e1, cbv.e2);
		//System.out.println("After change1():   Employee e1: " + cbv.e1 + "  Employee e2: " + cbv.e2);
		
		cbv = new CallByValue();
		cbv.change2(cbv.e1, cbv.e2);
		System.out.println("After change2():   Employee e1: " + cbv.e1 + "  Employee e2: " + cbv.e2);
		
		//cbv = new CallByValue();
		//cbv.change3(cbv.e1, cbv.e2);
		//System.out.println("After change3():   Employee e1: " + cbv.e1 + "  Employee e2: " + cbv.e2);
		
	}
	
}


