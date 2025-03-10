import java.util.Arrays;
import java.util.InputMismatchException;
import java.util.Random;
import java.util.Scanner;

/**
 * @author Bryan Lawless
 * Behold! Evidence of functional programming in object oriented lanaguage
 */
class Main {
	public static void main(String[] args) {
		try (Scanner input = new Scanner(System.in)) {
			System.out.println("Enter a number for random number generator: ");
			int randomLimit = input.nextInt();

			int[] randomArrOne = populateRandom(randomLimit);
			System.out.println("Filled array with random numbers: " + Arrays.toString(randomArrOne));

			System.out.println("Enter a number to check for: ");
			int numberToCheck = input.nextInt();
			
			Boolean status = FindValue(randomArrOne, numberToCheck);
			System.out.println("Number found: " + status);

			int[] reversed = ArrayReverse(randomArrOne);
			System.out.println("Reversed array: " + Arrays.toString(reversed));

			int[] randomArrTwo = populateRandom(randomLimit);
			System.out.println("Filled second array with random numbers: " + Arrays.toString(randomArrTwo));

			int[] commonValues = FindCommon(randomArrOne, randomArrTwo);
			System.out.println("Found common values between two arrays: " + Arrays.toString(commonValues));

			int[] evenOdd = FindEvenOdd(commonValues);
			System.out.println("Found " + evenOdd[0] + " even values and " + evenOdd[1] + " values.");

			final double average = ArrayAverage(commonValues);
			System.out.println("Average of common numbers (without min and max): " + average);
		} catch (InputMismatchException e) {
			System.err.println("Invalid input!");
		}
	}

	static int[] append(int[] arr, int value) {
		arr  = Arrays.copyOf(arr, arr.length + 1);
		arr[arr.length - 1] = value;

		return arr;
	}

	static int[] dropValues(int[] arr, int... vals) {
		int[] newArr = Arrays.copyOf(arr, arr.length);

		for (int i = 0; i < arr.length; i++) {
			for (int val : vals) {
				if (val != arr[i]) append(newArr, val);
			}
		}

		return newArr;
	}

	static int[] populateRandom(int limit) {
		int[] arr = new int[limit];
		Random rand = new Random();

		for (int i = 0; i < arr.length; i++) {
			arr[i] = rand.nextInt(limit);
		}

		return arr;
	}

	static double ArrayAverage(int[] arr) {
		int min = 0;
		int max = 0;

		for (int number : arr) {
			if (number > max) max = number;
			if (min > number) min = number;
		}

		int[] filteredValues = dropValues(arr, min, max);

		return (double) Arrays.stream(filteredValues).sum() / arr.length;
	}

	static int[] FindEvenOdd(int[] arr) {
		int[] evenOdd = new int[2];

		for (int i = 0; i < arr.length; i++) {
			if (arr[i] % 2 == 0) {
				evenOdd[0]++;
			} else {
				evenOdd[1]++;
			}
		}

		return evenOdd;
	}

	static int[] FindCommon(int[] arrOne, int[] arrTwo) {
		int[] commonValues = {};

		for (int i = 0; i < arrOne.length; i++) {
			if (FindValue(arrTwo, arrOne[i])) {
				commonValues = append(commonValues, arrOne[i]);
			}
		}

		return commonValues;
	}

	static int[] ArrayReverse(int[] arr) {
		int index = 0;
		int[] reversed = new int[arr.length];

		for (int i = arr.length - 1; i >= 0; --i) {
			reversed[index] = arr[i];
			index++;
		}

		return reversed;
	} 

	static boolean FindValue(int[] arr, int value) {
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] == value) return true;
		}

		return false;
	}
}