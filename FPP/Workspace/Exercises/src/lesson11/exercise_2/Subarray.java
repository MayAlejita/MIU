package lesson11.exercise_2;

import java.util.HashMap;

public class Subarray {

	public static void main(String[] args) {
		String[] arr1 = {"A", "C", "E"};
		String[] arr2 = {"A", "B", "C", "D", "E"};
		String[] arr3 = {"A", "C", "F"};
		System.out.println("Is arr1 a subarray of arr2? (Expected answer: yes) " + isSubArray(arr1, arr2));
		System.out.println("Is arr3 a subarray of arr2? (Expected answer: no) " + isSubArray(arr3, arr2));
	}
	
	/**
	 * Returns true if every string in arr1 is contained
	 * in arr2. Assume that neither array is null.
	 */
	public static boolean isSubArray(String[] arr1, String[] arr2) {
		//implement
		var h = new HashMap<String, String>();
		for(String s1: arr2) {
			h.put(s1, s1);
		}
		for(String s2: arr1) {
			if(!h.containsKey(s2)) {
				return false;
			}			
		}
		return true;
	}
}
