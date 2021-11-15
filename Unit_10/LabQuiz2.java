
import java.util.Scanner;

public class LabQuiz2 {

	//method returns true if num is prime, false if not
	public static boolean isPrime(int num) {
		
		for (int i = 2; i <= num / 2; i++) {
			if (num % i == 0) {
				return false;
			}
		}
		return true;
	}
	
	public static void main(String[] args) {
		
		Scanner keyboard = new Scanner(System.in);
		
		System.out.println("Enter any integer number:");
		int input = keyboard.nextInt();
		
		int sum = 0;
		
		//increases the sum by i each iteration
		//prints out all integers being summed
		while (sum <= 1000) {
			sum += input;
			System.out.println(input);
			input++;
		}
		
		System.out.println("Sum: " + sum);
		
		//checks if the sum is less than 1010
		if (sum < 1010) {
			System.out.println("SWEET!");
		}
		//checks if the sum is prime
		if (isPrime(sum)) {
			System.out.println("PRIME!");
		}
		
		keyboard.close();
	}
}
