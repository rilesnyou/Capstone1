// area = l * w
// perimeter = 2( l + w)
public class Rectangle {
	
	private double length;
	private double width;
	private double area;
	private double perimeter;
	
	public Rectangle (double length, double width) {
		this.length = length;
		this.width = width;
	}
	public Rectangle() {
		
	}
	public void setArea(double area) {
		this.area = area;
	}
	
	public void setPerim(double perimeter) {
		this.perimeter = perimeter;
	}
	
	public double getLength() {
		return length;
	}
	
	public double getWidth() {
		return width;
	}
	
	public double calcArea() {
//		double area = (length * width);
		return (length * width);
	}
	
	public double calcPerim() {
		return 2 * (length + width);
	}
	public double getArea() {
		return area;
	}
	public double getPerimeter() {
		return perimeter;
	}
	
	public String toString() {
		return "Rectangle[length=" + length + ", width=" + width + "]";
	}

}