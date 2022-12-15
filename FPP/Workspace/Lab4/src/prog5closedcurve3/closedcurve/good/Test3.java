package prog5closedcurve3.closedcurve.good;

public class Test3 {
	
	public static void main(String[] args) {

		Polygon[] objects = { new Square(3),
							  new Triangle(4,5,6),
						      new Rectangle(3,4)};
		
		StringBuilder sb;	
		for(Polygon cc : objects) {
			sb = new StringBuilder();
			sb.append("For this ").append(cc.getClass().getSimpleName())
			.append("\n\tPerimeter = ").append(cc.computePerimeter());
			System.out.println(sb.toString());			
		}
    
	}

}