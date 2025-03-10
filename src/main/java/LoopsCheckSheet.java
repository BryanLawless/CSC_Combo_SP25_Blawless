import java.util.InputMismatchException;
import java.util.Random;
import java.util.Scanner;

/**
 * @author Bryan Lawless
 * Loops checksheet assignment
 */
public class LoopsCheckSheet {
	public static void main(String[] agrs) {
		try (Scanner input = new Scanner(System.in)) {
			int value; // Holds the random number
			int quantity; // How many times the outside loop should run 
			int nestedCount; // Nested loop initializer

			int sum = 0; // Keeps track of the current sum
			int count = 0; // Loop one initializer
 
			// Amount of times to run the loop
			System.out.println("Enter the number of times to run the loop: ");
			quantity = input.nextInt();

			// Create a new instance of Random
			Random random = new Random();

			// Loop one condition
			while (count < quantity) { // Loop one body

				// Show the current count 
				System.out.println("Outer loop count: " + (count + 1));

				// Random: max - min + 1 + min
				value = random.nextInt(100 - 5 + 1) + 5;
				System.out.println("Random number is: " + value);

				// Reset the nested count each time
				nestedCount = 0;

				 // Nested loop condition
				while (nestedCount < value) { // Nested loop body
					nestedCount++; // Nested loop changer
					System.out.print(nestedCount + " ");
				} // end while

				// Newline for making everything look pretty
				System.out.println();

				// Add to the sum
				sum = sum + value;

				// Loop one changer
				count++;
			} // end while

			// Output the total sum
			System.out.println("Total sum: " + sum);
		} catch (InputMismatchException e) {
			System.err.println("Invalid input!");
		}
	}
}