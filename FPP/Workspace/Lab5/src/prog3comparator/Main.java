package prog3comparator;

import java.util.Arrays;

public class Main {

	public static void main(String[] args) {
		
		String[] testStrings = { "andy", "mike", "joe", "allen", "stephan" };
		
		System.out.println("Before:");
		System.out.println(Arrays.asList(testStrings));
		
		boolean ascending = true;
		StringSort ss = new StringSort(new StringLengthComparator(ascending));
		ss.stringSort(testStrings);

		System.out.println("After:");
		System.out.println(Arrays.asList(testStrings));
	}
}