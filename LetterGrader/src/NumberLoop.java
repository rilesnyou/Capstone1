import java.util.Scanner;

public class NumberLoop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		try (Scanner scnr = new Scanner(System.in)) {
			boolean shouldContinue = true;

			while (shouldContinue) {

				for (int count = 0; count <= 9; count++) {

					System.out.print(count + "|");
				}
				System.out.print("Would you like to continue? (y/n)?");
				String reply = scnr.next();
				shouldContinue = reply.contentEquals("y");
			}
			System.out.println("Goodbye!");
		}
	}
}