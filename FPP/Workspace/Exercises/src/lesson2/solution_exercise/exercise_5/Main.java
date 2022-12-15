package lesson2.solution_exercise.exercise_5;

import java.util.Arrays;

public class Main {

	public static void main(String[] args) {
		String t = "Hello,strings can be fun. They have many uses.";
        //use the function split() with carefully chosen separators to produce:
		//[Hello, strings, can, be, fun, They, have, many, uses]
		
		String split = Arrays.toString(t.split(",| |\\. |\\."));
		System.out.println(split);
	}

}
