import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class MovieReturn {

	private String input;
	private static String movie;
	private String genre;

	public MovieReturn(String choice) {
		choice = genre;
	}

	public void setMovieGenre(String genre) {
		this.genre = genre;
	}

	public void setMovieList(String movie) {
		this.movie = movie;
	}

	public String getMovieGenre() {
		ArrayList<String> genres = new ArrayList<>();
		genres.add("drama");
		genres.add("animated");
		genres.add("scifi");
		genres.add("horror");
		return genre;
	}

	public static LinkedList<String> getHorrorList() {
		LinkedList<String> horrorMovies = new LinkedList<>();
		horrorMovies.add("Cabin in the woods");
		horrorMovies.add("Jason");
		horrorMovies.add("Freddy");	
		return horrorMovies;
	}
	public static LinkedList<String> getDramaList() {
		LinkedList<String> dramaMovies = new LinkedList<>();
		dramaMovies.add("Midway");
		dramaMovies.add("Parasite");
		return dramaMovies;
	}
	public static LinkedList<String> getAnimList() {
		LinkedList<String> animMovies = new LinkedList<>();
		animMovies.add("Up");
		animMovies.add("Toy Story 3");
		return animMovies;
	}
	public static LinkedList<String> getScifiList() {
		LinkedList<String> sciMovies = new LinkedList<>();
		sciMovies.add("Alien");
		sciMovies.add("Pacific Rim");
		sciMovies.add("Predator");
		return sciMovies;	
	}

	public void setInput(String input) {
		this.input = input;
	}

	public String getInput() {
		return input;
	}

	public void setMovie(String movie) {
		this.movie = movie;
	}

	public void setGenre(String genre) {
		this.genre = genre;
	}

	public String getMovie() {
		return movie;
	}

	public String getGenre() {
		return genre;
	}

	public String toString() {
		return "Your genre type was " + genre + " , and your movie was " + movie + ".";
	}
}
