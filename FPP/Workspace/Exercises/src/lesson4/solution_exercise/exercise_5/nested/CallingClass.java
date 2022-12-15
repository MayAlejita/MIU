package lesson4.solution_exercise.exercise_5.nested;

import lesson4.exercise_5.MyClass;

public class CallingClass {
	
	public static void main(String[] arg) {
		// TODO Auto-generated method stub
		CallingClass a = new CallingClass();
		String b = a.readVal();

	}
		
	public String readVal() {
		MyClass cl = new MyClass();
		
		Employee e= new Employee();
		e.setNickName("aj");
		System.out.println(e.getNickName());

		
		return cl.getVal();
		
		
	}
	

}
