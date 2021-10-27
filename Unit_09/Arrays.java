
public class Arrays {

	public static int calculateSum(int[] arr) {
		
		int sum = 0;
		for (int i = 0; i < arr.length; i++) {
			sum += arr[i];
		}
		return sum;
	}
	
	public static int getProduct(int[] arr) {
		
		int product = 1;
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
		
		int[] array = {6, 1, 3, 5, 4, 2};
		
		System.out.println("Sum of array: " + calculateSum(array));
		System.out.println("Product of array: " + getProduct(array));
		System.out.println("Average: " + average(array));
		
		sortAscending(array);
		
		for (int i : array) {
			System.out.println(i);
		}
	}
}
