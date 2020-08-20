import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class MovieApp {

	public static void main(String[] args) {
		try (Scanner scnr = new Scanner(System.in)) {
			HashMap<Integer, String> genres = new HashMap<>();
			genres.put(1, "drama");
			genres.put(2, "animated");
			genres.put(3, "scifi");
			genres.put(4, "horror");
			genres.putAll(genres);

			LinkedList<String> drama = MovieReturn.getDramaList();
			LinkedList<String> anim = MovieReturn.getAnimList();
			LinkedList<String> scifi = MovieReturn.getScifiList();
			LinkedList<String> horror = MovieReturn.getHorrorList();

			boolean good = true;
			int choice = 0;

			while (good) {
				System.out.println("Hello, what genre of movie would you like?");
				System.out.println("1) Drama, 2) Animated, 3) Scifi, or 4) Horror?");
				System.out.println("--------------------------------------------------");
//		System.out.println("Please enter a number 1-4: ");
//		choice = scnr.nextInt();
				while (choice > 4 || choice < 1) {
					System.out.println("Please enter a number 1-4: ");
					choice = scnr.nextInt();
				}
				if (choice == 1) {
					System.out.println(drama);
				} else if (choice == 2) {
					System.out.println(anim);
				} else if (choice == 3) {
					System.out.println(scifi);
				} else if (choice == 4) {
					System.out.println(horror);

				}
				break;
			}

		}

	}
}
