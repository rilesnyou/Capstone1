import java.util.ArrayList;


public class ShapeChallenge {

	public static void main(String[] args) {
		ArrayList<Shape> shapes = new ArrayList<>();

		Circle circle1 = new Circle(25.5);
		Circle circle2 = new Circle(15.5);
		Rectangle rectangle1 = new Rectangle(6, 5);
		Rectangle rectangle2 = new Rectangle(25, 75);

		
		shapes.add(circle1);
		shapes.add(circle2);
		shapes.add(rectangle1);
		shapes.add(rectangle2);
		System.out.println(shapeWithLargestArea(shapes));
		System.out.println(compare(shapes));
	}

	public static Shape compare(ArrayList<Shape> shapes) {
		Shape largestShape = null;
		for (Shape shape : shapes) {
			if (largestShape == null || shape.calcArea() > largestShape.calcArea())
				largestShape = shape;

		}
		return largestShape;
	}
	
	public static Shape shapeWithLargestArea(ArrayList<Shape> shapes) {
	    Shape largest = shapes.get(0);
	    for(Shape e: shapes) {         
	        if (e.calcArea() > largest.calcArea()) {
	            largest = e;
	        }           
	    }
	    System.out.println(largest.calcArea());
	    return largest;
	} 
	}


