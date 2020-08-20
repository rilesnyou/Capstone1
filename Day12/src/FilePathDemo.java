import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class FilePathDemo {

	public static void main(String[] args) {

		Path relativePath = Paths.get("files1.txt");
		System.out.println(relativePath); // relative path will go whatever file for the pc into the folder destination
		System.out.println(relativePath.toAbsolutePath()); 
		Path absPath = Paths.get("C:/Users/Riley/Documents/GitHub/Day12/files1.txt"); //change \ in windows to / for eclipse to understand.
		System.out.println(Files.exists(relativePath)); // prints true or false depending if that file is real or not.
		System.out.println(absPath); // prints the absolute path for current PC. user > riley > docu > git > day12 .. will only go through those folders
		
		if (! Files.exists(relativePath)) { // if this path exists
			try {
			Files.createFile(relativePath); // create the file in that path
			} catch (IOException e) {
				System.out.println("Unable to create file "+ relativePath); // if not print this statement
			}
			// after running refresh folder in explorer to see if the new file was made.
		}
	}

}
