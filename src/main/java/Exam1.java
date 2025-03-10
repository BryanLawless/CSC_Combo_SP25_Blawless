import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * @author Bryan Lawless
 * Code for Exam One
 */
class Exam1 {
	public static void main(String[] args) {
		// MessagePrinter
		System.out.println("This is my first programming test");

		try (Scanner input = new Scanner(System.in)) {
			// BeverageSelector
			System.out.println("Choose a drink:\n(1) Water\n(2) Coke\n(3) Coffee");

			int drink = input.nextInt();

			switch (drink) {
				case 1 -> System.out.println("You chose water");
				case 2 -> System.out.println("You chose coke");
				case 3 -> System.out.println("You chose coffee");
				default -> System.out.println("Invalid drink!");
			}

			// TenMaker
			System.out.println("Enter first number: ");
			int numOne = input.nextInt();

			System.out.println("Enter second number; ");
			int numTwo = input.nextInt();

			if (makes10(numOne, numTwo)) {
				System.out.println("Your numbers add up to ten!");
			} else {
				System.out.println("Your numbers do not add up to ten!");
			}

			// Divider
			System.out.println("Enter the first value for division: ");
			double divideNumOne = input.nextDouble();

			System.out.println("Enter the second value for division: ");
			double divideNumTwo = input.nextDouble();

			if (divideNumTwo == 0) {
				System.out.println("Cannot divide by zero!");
				return;
			}

			double answer = divideNumOne / divideNumTwo;
			System.out.printf("The answer is %.2f when you divide %.2f by %.2f %n", answer, divideNumOne, divideNumTwo);

			// Accumulator
			int sum  = 0;
			while (true) { // Probably bad practice
				System.out.println("Enter a number (0 to continue): ");
				int addNumber = input.nextInt();

				if (addNumber == 0 ) {
					System.out.println("The total sum of your numbers is: " + sum);
					break;
				}

				sum += addNumber;
			} 

		} catch (InputMismatchException e) {
			System.err.println("Invalid input");
		}
	}

	static boolean makes10(int numOne, int numTwo) {
		return numOne + numTwo == 10;
	}
}