package lesson2.exercise_4;

import java.util.Arrays;

public class ExerciseStatic {
	
	public static void main(String[] args) {
		
		if(args == null || args.length == 0) {
			System.out.println("<no input>");
		}
		
		System.out.println(Arrays.toString(args));
		
		String finalSentence = "";
		int len = args.length;
		for(int i = 0; i < len-1; ++i) {
		finalSentence += (args[i] + " "); //inefficient
		}
		finalSentence += (args[len-1] + ".");
		System.out.println(finalSentence);
		
		
		String s = "a friendly face";
		s.charAt(2);
		
		System.out.println(s.substring(4));
		
		
		double A = Math.PI * Math.pow(5, 2);
		System.out.println(A);
		double diag = Math.sqrt(Math.pow(7, 2) + Math.pow(9, 2));
		System.out.println(diag);
		
		
		var b = 7 & 13 >> 2 ^ 5;
		
		System.out.println(b);
		
		
		double c = 3 * 5 / 9 % 2;
		double d =  4 ^ 3 & 5;
		double e =  13 >> 2 << 2 ^ 4;
		double f =  32 | 16/3 >> 2 & 5;
		
		System.out.println(c);
		System.out.println(d);
		System.out.println(e);
		System.out.println(f);
		
		int h = (b = 5);
		System.out.println(h);
		
		
	}

}
