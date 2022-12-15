package lesson5.exercise_1;

public class MyClass1 {
	
	private MyInnerClass inner;
	
	public MyInnerClass getInner() {
		return new MyInnerClass(0);
	}

	class MyInnerClass{
		private int innerInt;
		MyInnerClass(int x){
			innerInt = x;
		}
	}
	
	public static void main(String [] args) {
		MyClass1 a = new MyClass1();
		MyInnerClass b = a.getInner();
		System.out.println(b.innerInt);
	}
}
