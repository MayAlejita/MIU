package prog4figures;

public final class TriangleExtra {
	private final double base;
	private final double height;

	private final double side3;
	
	public TriangleExtra(double base, double height) {
		this(base, height, computeSide());
	}
	
	public TriangleExtra(double base, double height, double side3) {
		this.base = base;
		this.height = height;
		this.side3 = side3;		
	}

	public double getBase() {
		return base;
	}

	public double getHeight() {
		return height;
	}	
	
	public static double computeSide() {
		return 0.0;
	}
	
	public double computeHeight() {
		double baseL = 0.0;
		if(height > baseL) {
			baseL = height;			
		}
		if(base > baseL) {
			baseL = base;
		}
		if(side3 > baseL) {
			baseL = side3;
		}
		double s = (base + height + side3)/2;
		return 0.0;
		
	}
	
	public double computeArea() {
		return (base * height)/2;
	}

	public double getSide3() {
		return side3;
	}

}
