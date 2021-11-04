
import java.util.Random;

public class Arrays {

	public static int[] getArrayOfRandomNums(int size) {

		Random randy = new Random();
		int[] theArray = new int[size];
		
		for (int i = 0; i < size; i++) {
			theArray[i] = randy.nextInt(100);
		}
		return theArray;
	}

	public static int calculateSum(int[] arr) {

		int sum = 0;
		for (int i = 0; i < arr.length; i++) {
			sum += arr[i];
		}
		return sum;
	}

	public static long getProduct(int[] arr) {

		long product = 1;
		for (int i = 0; i < arr.length; i++) {
			product *= arr[i];
		}
		return product;
	}

	public static double average(int[] arr) {

		return calculateSum(arr) / arr.length;
	}

	public static int getIndexOfMin(int[] arr, int startLoc) {
		int indexOfMin = startLoc;
		for (int i = startLoc; i < arr.length; i++) {
			if (arr[i] < arr[indexOfMin]) {
				indexOfMin = i;
			}
		}
		return indexOfMin;
	}
	
	public static void sortAscending(int[] arr) {
		for (int i = 0; i < arr.length; i++) {
			int temp = arr[getIndexOfMin(arr,  i)];
			arr[getIndexOfMin(arr, i)] = arr[i];
			arr[i] = temp;
		}
	}
	
	public static void main(String[] args) {

		int[] randomArray = getArrayOfRandomNums(6);

		System.out.println("Sum of array: " + calculateSum(randomArray));
		System.out.println("Product of array: " + getProduct(randomArray));
		System.out.println("Average: " + average(randomArray));

		sortAscending(randomArray);

		for (int i : randomArray) {
			System.out.println(i);
		}
	}
}
