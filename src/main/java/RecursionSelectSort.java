import java.util.Arrays;
import java.util.Random;

class RecursionSelectSort {
	public static void main(String[] args) {
		final int ARRAY_SIZE = 20;

		int[] arr = new int[ARRAY_SIZE];
		fillArray(arr, ARRAY_SIZE);

		System.out.println(Arrays.toString(arr));

		int index = findLow(arr, 0);
		System.out.println("Index of lowest value: " + index);

		selectSortArray(arr, 0);
		System.out.println("Sorted array: " + Arrays.toString(arr));
	}

	private static void selectSortArray(int[] arr, int index) {
		if (index == arr.length) return;

		int lowestIndex = findLow(arr, index);

		int temp = arr[index];
		arr[index] = arr[lowestIndex];
		arr[lowestIndex] = temp;

		selectSortArray(arr, index + 1);
	}

	private static void fillArray(int[] arr, int limit) {
		Random rand = new Random();

		for (int i = 0; i < arr.length; i++) {
			arr[i] = rand.nextInt(limit) + 1;
		}
	}

	private static int findLow(int[] arr, int index) {
		int low = index;
		for (int i = index; i < arr.length; i++) {
			if (arr[i] < arr[low]) low = i;
		}
		
		return low;
	}
}