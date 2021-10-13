
//why did i do it like this
import java.util.Scanner;

public class MasterMind {
	
	final static String RAND = String.valueOf((int) (Math.random() * 899 + 100));
	
	//correct position
	public static boolean is1Correct(String num) {
		return num.substring(0, 1).equals((RAND.substring(0, 1)));
	}
	public static boolean is2Correct(String num) {
		return num.substring(1, 2).equals((RAND.substring(1, 2)));
	}
	public static boolean is3Correct(String num) {
		return num.substring(2, 3).equals((RAND.substring(2, 3)));
	}

	//wrong position
	public static boolean doesContain1(String num) {
		return RAND.contains(num.substring(0, 1));
	}
	public static boolean doesContain2(String num) {
		return RAND.contains(num.substring(1, 2));
	}
	public static boolean doesContain3(String num) {
		return RAND.contains(num.substring(2, 3));
	}
	
	public static void main(String[] args) {
		
		@SuppressWarnings("resource")
		Scanner keyboard = new Scanner(System.in);
		
		System.out.println("Guess a 3 digit number:");
		
		for (int i = 10; i >= 0; i--) {
			
			int correct = 0;
			int wrongPosition = 0;
			
			String guess = keyboard.next();
			
			if (is1Correct(guess) && is2Correct(guess) && is3Correct(guess)) {
				System.out.println("Correct!");
				i = 0;
			} else if (!doesContain1(guess) && !doesContain2(guess) && !doesContain3(guess)) {
				System.out.println("No digits correct.");
				System.out.println(i + " guesses left.");
			} else {
				if (is1Correct(guess)) {
					correct++;
				} else if (doesContain1(guess)) {
					wrongPosition++;
				}
				if (is2Correct(guess)) {
					correct++;
				} else if (doesContain2(guess)) {
					wrongPosition++;
				}
				if (is3Correct(guess)) {
					correct++;
				} else if (doesContain3(guess)) {
					wrongPosition++;
				}
				System.out.println(correct + " digits correct. " + wrongPosition + " digits correct but wrong location.");
				System.out.println(i + " guesses left.");
			}
		}
		System.out.println("The correct answer was " + RAND + ".");
	}
}
