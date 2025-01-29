import java.util.Scanner;

public class TempatureConversion {
	public static void main(String[] args) {
		try (Scanner input = new Scanner(System.in)) {
			System.out.println("Enter a tempature in Fahrenheit: ");
			double tempF = input.nextDouble();

			double tempC = (tempF - 32) * 5/9;
			double tempK = tempC + 273.15;

			System.out.printf("Fahrenheit to Celcius: %.3f C %n", tempC);
			System.out.printf("Celcius to Kelvin: %.3f K %n", tempK);
		}
	}
}
