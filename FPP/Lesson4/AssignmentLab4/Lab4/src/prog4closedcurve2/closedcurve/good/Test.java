package prog4closedcurve2.closedcurve.good;

public class Test {
	
	public static void main(String[] args) {

		ClosedCurve[] objects = {new Triangle(4,5,6),
								 new Square(3),
								 new Rectangle(3,7),
								 new Circle(3)};
		
		StringBuilder sb;
		//compute areas
		for(ClosedCurve cc : objects) {
			sb = new StringBuilder();
			sb.append("The area of this ").append(cc.getClass().getSimpleName()).append(" is ").append(cc.computeArea());
			System.out.println(sb.toString());			
		}
    
	}

}