import java.util.Scanner;
import java.util.Random;

public class RollDice {

	public static void main(String[] args) {
		Scanner scnr = new Scanner(System.in);
			String answer;
			do {
			System.out.println("How many sides does you dice have?: ");

			int sides = scnr.nextInt();
			generateRandomDieRoll(sides);


			System.out.println("Would you like to roll again? (y/n)");
			answer = scnr.next();
			} while (answer.equalsIgnoreCase("y"));
			System.out.println("Ok, have a good day.");
			scnr.close();
			}
		
	

	public static int generateRandomDieRoll(int dice) {
		Random ran = new Random();
		int number = 0;
		for (int x = 0; x < 1;) {
			int dice1 = ran.nextInt(dice) + 1;
			int dice2 = ran.nextInt(dice) + 1;
		System.out.println(dice1);
		System.out.println(dice2);
		break;
		} 
		
		
		return number;
		}
	}

