import java.util.Scanner;

public class ShapesApp {

	public static void main(String[] args) {

		Scanner scnr = new Scanner(System.in);

//		double input = Validator.getDouble(scnr, "Enter a radius: ");
//
//		Circle c1 = new Circle(input);
//
//		double area = c1.calcArea();
//		double circumference = c1.calcCircumference();

//		System.out.printf("Area of circle: %.4f\n", area);
//		System.out.printf("Circumference of circle: %.4f\n", c1.calcCircumference());
		
		double setLen = Validator.getDouble(scnr, "Enter a length: ");
		double setWid = Validator.getDouble(scnr, "Enter a width: ");
		
//		double areaRec = setLen * setWid;
		
		Rectangle r1 = new Rectangle(setLen, setWid);

		double perimeter = r1.calcPerim();
		double area = r1.calcArea();

		System.out.printf("Perimeter of rectangle: %.3f\n", perimeter);
		System.out.printf("Area of rectangle: %.3f\n", area);
		
		

		scnr.close();

	}

}