package lesson7.fibfactorial;

import java.util.ArrayList;
import java.util.List;

/** Recursive computation of Fibonacci numbers */
public class Fib {
	
	public static void main(String[] args) {
		Fib f = new Fib();
		//f.fib(12);
		//System.out.println(f.reverse("holada"));
		List<Integer> list = new ArrayList<Integer>();
		list.add(5); list.add(3); list.add(8); list.add(1);
		f.recurFindMin(list);
	}
	
	public int fib(int n) {
		System.out.printf("Entering fib with n = %d%n", n);
		if(n == 0 || n == 1) {
			System.out.printf("Entering base case with n = %d%n", n);
			System.out.printf("Returning val %d of fib(%d) in base case\n", n, n);
			return n;
		}

		int retVal = fib(n-1) + fib(n-2);
		System.out.printf("Returning val %d of fib(%d)%n", retVal, n);
		return retVal;
	}
	
	
	public String reverse(String s) {
		if(s == null || s.length() == 0) 
			return s; 
		String first = "" + s.charAt(0);
		return reverse(s.substring(1)) + first;
		}
	
	
	private Integer recurFindMin(List<Integer> list) {
		Integer first = list.remove(0);
		if(list.isEmpty()) {
			return first;
		}
		Integer recurMin = recurFindMin(list);
		return recurMin.compareTo(first) < 0 ? recurMin : first;
		
	}

}
