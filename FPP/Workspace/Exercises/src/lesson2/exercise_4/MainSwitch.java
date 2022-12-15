package lesson2.exercise_4;

import java.util.Scanner;

public class MainSwitch {
	
	public static void main(String [] args) {
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Input the name: ");
		String name = scanner.nextLine();
		scanner.close();
		
		switch(name) {
		case "Ana":
			System.out.println("The name is Ana");
			break;
		case "Mayra":
			System.out.println("The name is Mayra");
			break;
		default :
			System.out.println("Incorrect name");
		}
		
	}

}
