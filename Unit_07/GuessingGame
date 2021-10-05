
import java.util.Scanner;

public class GuessingGame {

	public static void main(String[] args) {
		
		Scanner keyboard = new Scanner(System.in);
		int random = (int)(Math.random() * 100);
		
		System.out.println("Guess a number:");
		``
		for (int i = 10; i >= 0; i--) {
			int guess = keyboard.nextInt();
			if (guess < random) {
			    System.out.println("Too low! " + i + " guesses left.");
			} else if (guess > random) {
			    System.out.println("Too high! " + i + " guesses left.");
			} else {
			    System.out.println("Correct!");
			    i = 0;
			}
		}
	}
}
