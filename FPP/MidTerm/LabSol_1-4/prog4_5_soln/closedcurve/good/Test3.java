package prog4_5_soln.closedcurve.good;

public class Test3 {
	public static void main(String[] args) {
		Polygon[] objects = {new Square(3),
							 new Triangle(4,5,6),
							 new Rectangle(3,4)};
		
		//compute areas
		for(Polygon p : objects) {
			String nameOfCurve = p.getClass().getSimpleName();

			System.out.println("For this "+
								nameOfCurve+ 
							   "\n  Perimeter = "+p.computePerimeter());
			
		}  
	}
}
