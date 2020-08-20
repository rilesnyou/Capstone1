import java.util.Scanner;

public class ObjectsDemo {
	
	
	public static Scanner scnr = new Scanner(System.in);

	public static void main(String[] args) {

		// create an instance (instantiate) of the Human class
		Human person1 = new Human("Will");
		Human person2 = new Human("Jill", 29, 60, "green", "orange");
		Human person3 = new Human("Bob");
		Human person4 = new Human("Kate");
		
		// set value of instance variable 
		person1.setAge(40);
		person1.setHeight(6);
		person1.setEye("blue");
		person1.setColor("yellow");

		
		person3.setHeight(4);
		person3.setEye("purple");
		person3.setAge(22);
		person3.setColor("purple");

		
		person4.setEye("green");
		person4.setAge(32);
		person4.setHeight(7);
		person4.setColor("orange");

		
		// get value of instance variable
//		int height = person2.getHeight();
		
		// must access method with an instance of the class

	
		
		person1.greeting();
		System.out.println(person1);
		person3.greeting();
		System.out.println(person3);
		person4.greeting();
		System.out.println(person4);
		person2.greeting();
		System.out.println(person2);

	}

}