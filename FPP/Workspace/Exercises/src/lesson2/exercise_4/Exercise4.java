package lesson2.exercise_4;

import java.util.Scanner;

public class Exercise4 {
	
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Input the name: ");
		String name = scanner.nextLine();
		
		int count = 0;
		for(int i =0; i< name.length(); i++) {		
			if(name.charAt(i) == 'e') {
				count ++;
			}
		}
		scanner.close();
		System.out.println("Repeat: " + count);
	}

}
