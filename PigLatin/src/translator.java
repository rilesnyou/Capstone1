import java.util.Scanner;

public class translator {

	public static void main(String[] args) {
		String word;
		String wording = null;
		String choice = null;
//		String vowels = "aeiou";
		changeWord(wording);
		Scanner scnr = new Scanner(System.in);

		do {
			System.out.println("Please enter a word you would like translated: ");
			word = scnr.next();
			word.toLowerCase();
			wording = changeWord(word);
			char firstLetter = word.charAt(0);
			StringBuilder sb = new StringBuilder(word);
//				if(vowels.substring(0, word))
					sb.deleteCharAt(0);
//				return sb.toString();
			String result = sb.toString();
			System.out.println("Your translated word is: " + result + firstLetter + wording + ".");
			System.out.println("Would you like to translate another word? (yes/no): ");
			choice = scnr.next();
		} while (choice.contentEquals("yes"));
			System.out.println("Okay, have a good day!");
		scnr.close();
	}

	public static String changeWord(String words) {
		String adds = ("ay");

		return adds;
	}
}


/* I could not figure out a way to only get the vowels
to remain in, i tried to figure something out forever */