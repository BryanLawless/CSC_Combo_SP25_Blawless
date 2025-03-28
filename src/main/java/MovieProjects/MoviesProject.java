package MovieProjects;

import java.util.Arrays;
import java.util.Objects;

public class MoviesProject {
	private String movieName;
	private String director;
	private int minutes;
	private double rating;
	private String[] actors;
	private int rottenTomatoScore;

	public MoviesProject () {
		this.movieName = "";
		this.director = "";
		this.minutes = 0;
		this.rating = 0;
		this.actors = new String[100];
		this.rottenTomatoScore = 0;
	}

	public MoviesProject(String movieName, String director, int minutes, double rating, int actors, int rottenTomatoScore) {
		this.movieName = movieName;
		this.director = director;
		this.minutes = minutes;
		this.rating = rating;
		this.actors = new String[actors];
		this.rottenTomatoScore = rottenTomatoScore;
	}

	public String getMovieName() {
		return movieName;
	}

	public void setActors(String[] actors) {
		this.actors = actors;
	}

	public void setMovieName(String movieName) {
		this.movieName = movieName;
	}

	public String getDirector() {
		return director;
	}

	public void setDirector(String director) {
		this.director = director;
	}

	public int getMinutes() {
		return minutes;
	}

	public void setMinutes(int minutes) {
		this.minutes = minutes;
	}

	public double getRating() {
		return rating;
	}

	public void setRating(double rating) {
		this.rating = rating;
	}

	public String[] getActors() {
		return actors;
	} 

	public int getRottenTomatoScore() {
		return rottenTomatoScore;
	}

	public void setRottenTomatoScore(int rottenTomatoScore) {
		this.rottenTomatoScore = rottenTomatoScore;
	}

	@Override
	public String toString() {
		String actorsFormatted = String.join(", ", Arrays.stream(actors).filter(Objects::nonNull).toArray(String[]::new));

		return String.format("""
Movie Name: %s
Director: %s
Minutes: %d
Rating: %.2f
Actors: %s
Rotten Tomato Score: %d
		""", movieName, director, minutes, rating, actorsFormatted, rottenTomatoScore);
	}
	
}
