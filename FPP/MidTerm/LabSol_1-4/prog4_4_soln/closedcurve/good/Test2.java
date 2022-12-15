package prog4_4_soln.closedcurve.good;

public class Test2 {
	public static void main(String[] args) {

		Polygon[] objects = {new Square(3),
							 new Triangle(4,5,6),
							 new Rectangle(3,4)};
		
		//compute areas
		for(Polygon p : objects) {
			String nameOfCurve = p.getClass().getSimpleName();

			System.out.println("For this "+
								nameOfCurve+ 
								"\n  Number of sides = " + p.getNumberOfSides() +
							   "\n  Perimeter = "+p.computePerimeter());
			
		}
    
	}
}
