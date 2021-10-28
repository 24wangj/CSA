
import java.util.Random;

public class Arrays {

	public static int[] getArrayOfRandomNums(int size) {

		Random randy = new Random();

		int[] theArray = new int[size];

		for(int x=0; x<size; x++) {
			theArray[x] = randy.nextInt(100);
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
	
	public static void sortAscending(int[] arr) {
		
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr.length; j++) {
				if (arr[i] < arr[j]) {
					int temp = arr[j];
					arr[j] = arr[i];
					arr[i] = temp;
				}
			}
		}
	}
	
	public static void main(String[] args) {

		int[] randomArray = getArrayOfRandomNums(8);
		
		System.out.println("Sum of array: " + calculateSum(randomArray));
		System.out.println("Product of array: " + getProduct(randomArray));
		System.out.println("Average: " + average(randomArray));
		
		sortAscending(randomArray);
		
		for (int i : randomArray) {
			System.out.println(i);
		}
	}
}
