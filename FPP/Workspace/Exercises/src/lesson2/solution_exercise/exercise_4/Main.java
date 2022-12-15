
package lesson2.solution_exercise.exercise_4;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Type your name");
		String nextLine = sc.nextLine();
		int count = 0;
		for(int i = 0; i < nextLine.length(); ++i) {
			if(nextLine.charAt(i) == 'e') {
				count++;
			}
		}
		sc.close();
		System.out.println(count);
	}
}




