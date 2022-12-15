package lesson5.solution_exercise.exercise_1;

public class MyClass {
	private MyInner inner;
	public MyInner getMyInner() {
		return inner;
	}
	@SuppressWarnings("unused")
	private class MyInner {
		private int innerInt;	
		MyInner(int x) {
			innerInt = x;
		}
	}
	public static void main(String[] args) {
		MyClass mc = new MyClass();
		MyInner  mi = mc.getMyInner();
		System.out.println(mi.innerInt);
	}
}


