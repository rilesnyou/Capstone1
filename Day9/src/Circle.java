public class Circle {

	// instance variable
	private double radius;

	// implicitly use default constructor
	public Circle(double radius) {
		this.radius = radius;
	}

	// no args constructor
	public Circle() {
		// no values being assigned to instance variables
	}

	public void setRadius(double radius) {
		this.radius = radius;
	}

	public double getRadius() {
		return radius;
	}

	public double calcArea() {
		return Math.PI * Math.pow(radius, 2);
	}

	public double calcCircumference() {
		return 2 * Math.PI * radius;
	}

	public String toString() {

		// String.format("Circle[radius=%f]",radius );
		return "Circle[radius=" + radius + "]";
	}

}