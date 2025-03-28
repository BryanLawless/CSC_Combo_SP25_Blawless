package MovieProjects;

import java.util.Arrays;
import java.util.Scanner;

/**
 * @author Bryan Lawless
 */
public class MoviesProjectDriver {
	public static void main(String[] args) {
		MoviesProject movies = new MoviesProject();

		// Set movie data
		setMovieData(movies);

		// Display movie data
		displayMovieData(movies);

		// Second object
		MoviesProject movies2 = new MoviesProject("Aliens", "James Cameron", 100, 9, 90, 89); // Not accurate

		// Set Actors
		movies2.setActors(new String[]{"John Doe", "Jane Doe", "Bob Doe"});

		// Display secondInstance movie data
		displayMovieData(movies2);
	}

	public static void displayMovieData(MoviesProject moviesInstance) {
		System.out.println(moviesInstance.toString());
	}

	public static void setMovieData(MoviesProject moviesInstance) {
		 try (Scanner scanner = new Scanner(System.in)) {
			System.out.println("Name of the movie: ");
			String movieName = scanner.nextLine();
			moviesInstance.setMovieName(movieName);

			System.out.println("Director of movie: ");
			String movieDirector = scanner.nextLine();
			moviesInstance.setDirector(movieDirector);

			System.out.println("Movie duration (minutes): ");
			int movieMinutes = scanner.nextInt();
			moviesInstance.setMinutes(movieMinutes);

			System.out.println("Moive rating (1-10): ");
			int movieRating = scanner.nextInt();
			moviesInstance.setRating(movieRating);

			System.out.println("Moive Actors: (type `c` to stop): ");

			scanner.nextLine(); // Just consume newline for now for nice formatting

			String[] movieActors = new String[100];
			boolean actorInputFinished = false;
			while (!actorInputFinished) {
				System.out.println("Enter actor name: ");
				String actor = scanner.nextLine();

				if (!actor.equals("c")) {
					movieActors = append(movieActors, actor);
				} else {
					actorInputFinished = true;
				}
			}

			moviesInstance.setActors(movieActors);

			System.out.println("Rotten Tomato Score: ");
			int movieRottenTomato = scanner.nextInt();
			moviesInstance.setRottenTomatoScore(movieRottenTomato);
		 }
	}

	static String[] append(String[] arr, String value) {
		arr  = Arrays.copyOf(arr, arr.length + 1);
		arr[arr.length - 1] = value;

		return arr;
	}
}
