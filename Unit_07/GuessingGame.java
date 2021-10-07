
import java.util.Scanner;

public class GuessingGame {

	public static void main(String[] args) {
		
		final int MAX = 1000;
		final int RANDOM = (int)(Math.random() * MAX);
		
		@SuppressWarnings("resource")
		Scanner keyboard = new Scanner(System.in);
		
		System.out.println("Guess a number between 0 and " + MAX + ":");
		
		for (int i = 10; i >= 0; i--) {
			int guess = keyboard.nextInt();
			if (guess < RANDOM) {
			    System.out.println("Too low! " + i + " guesses left.");
			} else if (guess > RANDOM) {
			    System.out.println("Too high! " + i + " guesses left.");
			} else {
			    System.out.println("Correct!");
			    i = 0;
			}
		}
		System.out.println("The correct number was " + RANDOM + "!");
	}
}
