import java.util.ArrayList;
import java.util.Scanner;
import java.util.Arrays;

public class ArrayTest {
	
	private static Scanner scnr = new Scanner(System.in);
	
	public static void main(String[] args) {
		testList();
	}
		private static void testList() {
			ArrayList<String> colors = new ArrayList<>();
			colors.add("red");
			colors.add("green");
			colors.add("white");
			colors.add("blue");
			System.out.println(colors);
			colors.remove("green");
			while (getYesNo(scnr, "Do you want to add another color? Yes / No: ")) {
				System.out.println("Enter another color: ");
				String newColor = scnr.nextLine();
				colors.add(newColor);
				System.out.println(colors);
			}
			for (int i = 0; i < colors.size(); i++) {
				System.out.println(i + " " + colors.get(i));
			}
			for (String color : colors) {
				System.out.println(color);
			}
			System.out.println(colors.indexOf("white"));
			colors.set(1, "purple");
			System.out.println("Okay here are your current colors: " + colors);

		}
		public static boolean getYesNo(Scanner scnr, String prompt) {
			String input;
			boolean isValid;
			do {
				System.out.println(prompt);
				input = scnr.nextLine();
				isValid = "yes".equalsIgnoreCase(input) ||
						"no".equalsIgnoreCase(input) || "y".equalsIgnoreCase(input)
						|| "n".equalsIgnoreCase(input);
				if (!isValid) {
					
				}
			} while (!isValid);
			
			return input.toLowerCase().startsWith("y");
		}

	}


