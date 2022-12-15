package lesson5.exercise_1;

public class MyClass {
    private int value =5;
    
    public int getValue() {
    	return value;
    }
    private static MySubClass clsub;
    
	public MyClass(){
	}
    
	public class TheInnerClass{
	    public int evaluate() {
	    	return value;
	    }
	}
	
	void run() {
		MyClass.TheInnerClass inner = clsub.new TheSubInner();
		System.out.println(inner.evaluate());
	}
	
    public static void main(String[] args) {
    	clsub = new MySubClass();
    	clsub.run();
    }
}

class MySubClass extends MyClass{
	private int value= getValue() +1;
	public class TheSubInner extends MyClass.TheInnerClass{
		public int evaluate() {
			return super.evaluate() + value;
		}
	}
	MySubClass(){
	}
}


