import java.util.HashMap;

public class HashMapTrying {

	public static void main(String[] args) {
		bookMap();

	}

	public static void bookMap() {
		HashMap<String, Integer> books = new HashMap<>();
		books.put("Tuscan", 40);
		books.put("Lizard", 7);
		books.put("Wallaby", 18);

		books.remove("Tuscan");
		books.replace("Lizard", 12);

//		for (Integer bookPage : books.values()) {
//			for (String bookName : books.keySet()) {
		System.out.print("The page number for that is: ");
		System.out.println(books.get("Lizard"));

		System.out.println(books);
		System.out.print("That book is in the map: ");
		System.out.println(books.containsKey("Wallaby"));
	}
}