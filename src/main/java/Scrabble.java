import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Scrabble {
	public static void main(String args[]) {
		try (Scanner input = new Scanner(System.in)) {
			// Get inputs, trim to remove and whitespace
			System.out.println("Enter the tiles you have: ");
			String tiles = input.nextLine().trim();

			System.out.println("Enter your word: ");
			String word = input.nextLine().trim();

			// Split the tiles into a list for easier manipulation
			List<String> tileChunksList = new ArrayList<>(Arrays.asList(tiles.split("")));

			// Check if we can spell the word
			System.out.println(canSpell(tileChunksList, word) ? "You can spell: " + word : "You cannot spell: " + word);
		} catch (Exception e) {
			System.err.println("Invalid input or an error occurerd: " + e);
		}
	}

	// Wanted to experiment with Arrays/List - probably over-complicated
	public static boolean canSpell(List<String> tiles, String word) {		
		for (int i = 0; i < word.length(); i++) {
			String letter = String.valueOf(word.charAt(i));
			if (!tiles.contains(letter)) return false;

			tiles.remove(i);
		} 

		return true;
	}
}
