
import java.util.Scanner;

class CheckInput {
	public static void main(String[] args) {
		String word;
		int intNum;
		float realNum;
		double biggerRealNum;
		char letter;

		try (Scanner input = new Scanner(System.in)) {
			System.out.println("Enter words:");
			word = input.next();
			System.out.println("Words: " + word);

			System.out.println("Enter number:");
			intNum = input.nextInt();
			System.out.println("Number: " + intNum);

			System.out.println("Enter real number:");
			realNum = input.nextFloat();
			System.out.println("Real number: " + realNum);

			System.out.println("Enter bigger real number:");
			biggerRealNum = input.nextDouble();
			System.out.printf("$%.2f \n", biggerRealNum);

			System.out.println("Enter a letter: ");
			letter = input.next().charAt(0); // Get first char
			System.out.println("Letter: " + letter);

			realNum = 987654321.987654321f;
			realNum = realNum + realNum;

			// Nine decimal places (float)
			System.out.printf("Float result with 9 decimal places: %.9f \n", realNum);

			// Nine decimal places (double)
			biggerRealNum = 987654321.987654321;
			biggerRealNum = biggerRealNum + biggerRealNum;
			System.out.printf("Double result with 9 decimal places: %.9f \n", biggerRealNum);

			// Uppercase
			System.out.println("Uppercase word variant: " +  word.toUpperCase());

		} catch (Exception err) {
			System.err.println("Invalid input, try again: \n" + err);
		}
	}
}