package lesson4.solution_exercise.exercise_5.nested;

public class MyClass extends MySuperClass {
	
	//Makes the getVal of MySuperClass explicitly available
	@Override
	public String getVal() {
		return super.getVal();
	}
}
