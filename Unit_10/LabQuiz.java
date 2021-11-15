
import java.util.Scanner;

public class LabQuiz {

	public static void main(String[] args) {
		
		Scanner keyboard = new Scanner(System.in);
		System.out.println("Input an integer between 1 and 30:");

		boolean isGreaterThan100 = false;
		
		while (isGreaterThan100 == false) {
			int sum = 0;
			int input = keyboard.nextInt();
			if (input < 1 || input > 30) {
				System.out.println("Out of range, please re-enter your number:");
			} else {
				for (int i = 1; i <= input; i++) {
					sum += i;
				}
				if (sum > 100) {
					isGreaterThan100 = true;
					System.out.println("Sum: " + sum);
					System.out.println("AWESOME!");
				} else {
					System.out.println("Sum: " + sum);
				}
			}
		}
		keyboard.close();
	}
}
