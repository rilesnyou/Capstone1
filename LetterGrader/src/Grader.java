import java.util.Scanner;

public class Grader {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		try (Scanner scnr = new Scanner(System.in)) {
			System.out.println("Please enter your percent");
			int percent = scnr.nextInt();

			if (percent >= 90) {
				System.out.println("You got an A");
			} else if (percent >= 80 && percent < 90) {
				System.out.println("You got a B");
			} else if (percent >= 70 && percent < 80) {
				System.out.println("You got a C");
			} else if (percent >= 60 && percent < 70) {
				System.out.println("You got a D");
			} else
				System.out.println("You failed");

			String  userInput;
			System.out.println("What grade did you want? (Capital letters only)");
			userInput = scnr.next();
			
			switch (userInput) {

			case "A":
				System.out.println("Your pecent would need to be between 90 and 99.");
				break;
			case "B":
				System.out.println("Your pecent would need to be between 80 and 89.");
				break;
			case "C":
				System.out.println("Your pecent would need to be between 70 and 79.");
				break;
			case "D":
				System.out.println("Your pecent would need to be between 60 and 69.");
				break;
			case "F":
				System.out.println("Your pecent would need to be below 50.");
				break;
				
			default:
			System.out.println("Enter a letter grade you wanted to get (Capital letter only).");

			
			}
		}

	}

}
