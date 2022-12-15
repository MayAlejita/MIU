package prog4figures;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Insert the width:");
		String width = sc.next();
		System.out.print("Insert the length:");
		String length = sc.next();
		System.out.print("Insert the base:");
		String base = sc.next();
		System.out.print("Insert the height:");
		String height = sc.next();
		System.out.print("Insert the radius:");
		String radius = sc.next();
		
		sc.close();
		
		Rectangle rectangle = new Rectangle(Double.valueOf(width), Double.valueOf(length));
		double areaR = rectangle.computeArea();
		System.out.println("Area of Rectangle is " + areaR);
		
		Triangle triangle = new Triangle(Double.valueOf(base), Double.valueOf(height));
		double areaT = triangle.computeArea();
		System.out.println("Area of Triangle is " + areaT);
		
		Circle circle = new Circle(Double.valueOf(radius));
		double areaC = circle.computeArea();
		System.out.println("Area of Circle is " + areaC);
		

	}

}
