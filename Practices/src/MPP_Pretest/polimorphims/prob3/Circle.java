package MPP_Pretest.polimorphims.prob3;

public class Circle implements ComputeArea{
	private double radius;
	
	public Circle(double radius) {
		this.radius = radius;
	}
	public double getRadius() {
		return radius;
	}
	public void setRadius(double radius) {
		this.radius = radius;
	}

	@Override
	public double computeArea() {
		System.out.println("the circle area is: " + Math.PI * radius * radius);
		return Math.PI * radius * radius;
	}
}
