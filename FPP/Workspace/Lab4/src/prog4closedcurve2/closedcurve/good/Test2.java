package prog4closedcurve2.closedcurve.good;

public class Test2 {
	
	public static void main(String[] args) {

		Polygon[] objects = { new Square(3),
							  new Triangle(4,5,6),
						      new Rectangle(3,4)};
		
		StringBuilder sb;

		for(Polygon cc : objects) {
			sb = new StringBuilder();
			sb.append("For this ").append(cc.getClass().getSimpleName()).append("\n\tNumber of sides = ")
			.append(cc.getNumberOfSides()).append("\n\tPerimeter = ").append(cc.computePerimeter());
			System.out.println(sb.toString());			
		}
    
	}

}