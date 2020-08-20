import java.awt.BorderLayout;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class ObjectsToFiles {

	// Note: NIO uses the Path class, not just a file path String.
	private static Path filePath = Paths.get("Tacolists.txt");

	public static void main(String[] args) {
		Scanner scnr = new Scanner(System.in);
		
		public class GUI implements ActionListener{
			
			public GUI() {
				
				JFrame frame = new JFrame();
				
				JButton button = new JButton("Click me");
				button.addActionListener(this);
				JLabel label = new JLabel("Number of clicks: 0");
				JPanel panel = new JPanel();
				panel.setBorder(BorderFactory.createEmptyBorder(30, 30, 10, 30));
				panel.setLayout(new GridLayout(0, 1));
				panel.add(button);
				panel.add(label);
				
				frame.add(panel, BorderLayout.CENTER);
				frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
				frame.setTitle("Our GUI");
				frame.pack();
				frame.setVisible(true);
				
			}
		}

		while (true) {
			System.out.print("Enter a command (list, add, quit): ");
			String command = scnr.nextLine();
			if (command.equals("quit")) {
				break;
			} else if (command.equals("list")) {
				List<Tacos> things = readFile();
				int i = 1; 
				for (Tacos thing : things) {
					System.out.println(i++ + ". " + thing);
				}
			} else if (command.equals("add")) {
				Tacos player = getPlayerFromUser(scnr);
				System.out.println("Adding " + player);
				appendLineToFile(player);
			} else {
				System.out.println("Invalid command.");
			}
		}
		System.out.println("Fine, you're cut off from the taco bar now...");
		scnr.close();
	}
	
	private static Tacos getPlayerFromUser(Scanner scnr) {
		// TODO #1 adjust this for your class, not Player
		String type = Validator.getString(scnr, "Enter taco type (chicken, beef, veggie, what ever you want): ");
		int tacoCount = Validator.getInt(scnr, "Enter number of taocs you wanna eat: ");
		boolean Tasty = Validator.getYesNo(scnr, "Is that type of taco tasty (yes/no)? ");
		return new Tacos(type, tacoCount, Tasty);
	}

	/**
	 * Read all the objects from a file and store them in a List.
	 */
	public static List<Tacos> readFile() {
		try {
			List<String> lines = Files.readAllLines(filePath);
			// TODO #2 Add code here... convert this list of String lines from
			// the file to a list of our objects. (Player, in my case)
			List<Tacos> Tacos = new ArrayList<>();
			for (String line : lines) {
				// #1 split the line based on the delimiter
				String[] parts = line.split("~~~");
				// #2 select each part based on index position and convert
				// to the correct type
				String type = parts[0];
				int tacoCount = Integer.parseInt(parts[1]);
				boolean Tasty = Boolean.parseBoolean(parts[2]);
				// #3 use the data to create an object and add it to the list
				Tacos.add(new Tacos(type, tacoCount, Tasty));
			}
			
			return Tacos;
		} catch (IOException e) {
			System.out.println("Unable to read file.");
			return new ArrayList<>();
		}
	}

	/**
	 * Add an object to the end of the file.
	 */
	public static void appendLineToFile(Tacos thing) {
		String line = thing.getType() + "~~~" + thing.getTacoCount() + "~~~" + thing.isTasty();
		
		// TODO #3 add code here... convert your object to a string like
		// it should be as a line in the file. store it in the `line` variable.
		
		// Files.write requires a list of lines. Create a list of one line.
		List<String> lines = Collections.singletonList(line);
		try {
			Files.write(filePath, lines, StandardOpenOption.CREATE,
					StandardOpenOption.APPEND);
		} catch (IOException e) {
			System.out.println("Unable to write to file.");
		}
	}
	
	public static List<Book> readFileBook() {
		try {
			List<String> lines = Files.readAllLines(filePath);
			List<Book> Books = new ArrayList<>();
			for (String line : lines) {
				String[] parts = line.split("~~~");
				String country = parts[0];
				Books.add(new Book(line, line, false, 0));
			}
			
			return Books;
		} catch (IOException e) {
			System.out.println("Unable to read file.");
			return new ArrayList<>();
		}
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	public static List<Book> searchByAuthor(List<Book> list, String author) {
		List<Book> authorList = new ArrayList<>();
		for (Book book : list) {
			int i = 0;
			if (list.get(i).getAuthor().equalsIgnoreCase(author)) {
				authorList.add(list.get(i));
			}
			i++;
		}
		return authorList;
	}
	
	
	public static ArrayList<String> findAuthor() {
		ArrayList<String> authors = new ArrayList<>();
		authors.add("Joseph Heller");
		authors.add("Thomas Pynchon");
		authors.add("Niccolo Machiaevlli");
		authors.add("Palahniuk");
		authors.add("Franz Kafka");
		authors.add("Kurt Vonnegut");
		authors.add("Herman Melville");
		
		StringBuilder sb = new StringBuilder();
		for (String s : authors) {
			sb.append(s);
			sb.append("\n");
		}
		return authors;		
	}
	
//	public class GUI {
//		
//		public GUI() {
//			
//			JFrame frame = new JFrame();
//			
//			JPanel panel = new JPanel();
//			panel.setBorder(BorderFactory.createEmptyBorder(30, 30, 10, 30));
//			panel.setLayout(new GridLayout(0, 1));
//			
//			frame.add(panel, BorderLayout.CENTER);
//			frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//			frame.setTitle("Our GUI");
//			frame.pack();
//			frame.setVisible(true);
//		}
//	}
	
	

}