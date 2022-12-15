package prog4_7_soln.employeeinfo;

import java.util.Arrays;
import java.util.Objects;

public class MyString {


	public static void main(String[] args) {
		new MyString();

	}

	public MyString() {
		MyAnotherClass a = new MyAnotherClass(this);
	}
	
	public void myMethod() {
		System.out.println("hhh");
	}

}

class MyAnotherClass{
	
	MyAnotherClass(MyString m){
		m.myMethod();
	}
}
