package lesson11.exercise_1;

import java.util.Objects;

public class MyClass {
	private int val;
	public MyClass(int x) {
		val = x;
	}
	public int getVal() {
		return val;
	}
	//implement
	@Override
	public int hashCode() {
		return Objects.hash(val);
	}
	@Override
	public String toString() {
		return "MyClass object #" + val;
	}
	public static void main(String[] args) {
		
		MyClass cl1;
		MyHashtable hashtable = new MyHashtable();
		for(int i =1; i<=10; i++) {
			cl1 = new MyClass(i);
			hashtable.put(cl1, i);
		}
		hashtable.printTable();
		
	}
}
