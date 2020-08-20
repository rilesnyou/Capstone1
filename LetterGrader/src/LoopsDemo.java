import java.util.Scanner;

public class LoopsDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		try (Scanner scnr = new Scanner(System.in)) {
			boolean shouldContinue = true;

			while (shouldContinue) {

				System.out.println("Hello, World!");
				System.out.println("Would you like to continue? (y/n)?");

				String reply = scnr.next();
				shouldContinue = reply.contentEquals("y");
			}
				System.out.println("Good bye!");

			}
		}
	}

