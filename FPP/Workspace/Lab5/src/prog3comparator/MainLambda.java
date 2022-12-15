package prog3comparator;

import java.util.Arrays;

public class MainLambda {

	public static void main(String[] args) {
		String[] testStrings = { "andy", "mike", "joe", "allen", "stephan" };
		
		System.out.println("Before:");
		System.out.println(Arrays.asList(testStrings));
		
		boolean ascending = true;
		StringSort ss = new StringSort((o1, o2) -> ascending ? (o1.length() - o2.length()) : (o2.length() - o1.length()));
		ss.stringSort(testStrings);

		System.out.println("After:");
		System.out.println(Arrays.asList(testStrings));

	}

}
