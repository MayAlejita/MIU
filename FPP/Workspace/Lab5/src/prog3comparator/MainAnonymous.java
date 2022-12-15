package prog3comparator;

import java.util.Arrays;
import java.util.Comparator;

public class MainAnonymous {

	public static void main(String[] args) {
		
		String[] testStrings = { "andy", "mike", "joe", "allen", "stephan" };
		
		System.out.println("Before:");
		System.out.println(Arrays.asList(testStrings));
		
		boolean ascending = true;
		StringSort ss = new StringSort(new Comparator<String>() {
			public int compare(String o1, String o2) {
				return ascending ? (o1.length() - o2.length()) : (o2.length() - o1.length());
			}
		});
		ss.stringSort(testStrings);

		System.out.println("After:");
		System.out.println(Arrays.asList(testStrings));
	}
}