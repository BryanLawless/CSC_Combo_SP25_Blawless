import java.util.Scanner;

/**
 * Loop in class exercises
 * @author Bryan Lawless
 */
class LoopPractice {
	public static void main(String[] args) {
		int naturalWhileSum = 0; // Sum of the first 10 natural numbers using while loop
		int i = 1; // Loop counter for while loop
		while (i <= 10) {
			naturalWhileSum += i;
			i++;
		}

		System.out.println("[While loop] Total sum of the first 10 natural numbers: " + naturalWhileSum);

		int naturalForSum = 0; // Sum of the first 10 natural numbers using for loop
		for (int j = 1; j <= 10; j++) {
			naturalForSum += j;
		}

		System.out.println("[For loop] Total sum of the first 10 natural numbers: " + naturalForSum);

		try (Scanner scanner = new Scanner(System.in)) {
			System.out.print("Enter the number of terms for Fibonacci series: ");
			int n = scanner.nextInt(); // Number of terms for Fibonacci series

			int a = 0, b = 1; // Initial two terms of Fibonacci series
			
			System.out.print("[For loop] Fibonacci series: " + a + " " + b);

			for (int k = 2; k < n; k++) { // Loop counter for Fibonacci series using for loop
				int next = a + b; // Next term in Fibonacci series
				System.out.print(" " + next);

				a = b;
				b = next;
			}

			a = 0;
			b = 1;
			int count = 2; // Loop counter for Fibonacci series using while loop

			System.out.print("\n[While loop] Fibonacci series: " + a + " " + b);
			
			while (count < n) {
				int next = a + b; // Next term in Fibonacci series
				System.out.print(" " + next);

				a = b;
				b = next;

				count++;
			}
			
			System.out.println();

			System.out.print("Enter the number of rows for the right angle triangle pattern: ");
			int rows = scanner.nextInt(); // Number of rows for the triangle pattern

			System.out.println("Right angle triangle pattern: ");
			for (int m = 1; m <= rows; m++) {
				for (int p = 1; p <= m; p++) {
					System.out.print("* ");
				}
				
				System.out.println();
			}

			scanner.close();
		} catch (Exception e) {
			System.err.println("Invalid input: " + e);
		}
	}
}