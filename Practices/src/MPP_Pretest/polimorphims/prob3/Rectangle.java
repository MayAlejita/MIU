package MPP_Pretest.polimorphims.prob3;

public class Rectangle implements ComputeArea{
	private double length;
	private double width;
	public Rectangle(double width, double length) {
		this.width = width;
		this.length = length;
	}
	public double getLength() {
		return length;
	}
	public void setLength(double length) {
		this.length = length;
	}
	public double getWidth() {
		return width;
	}
	public void setWidth(double width) {
		this.width = width;
	}

	@Override
	public double computeArea() {
		System.out.println("the rectangle area is: " + length * width);
		return length * width;
	}
}
