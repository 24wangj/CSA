
import java.util.Scanner;

public class FactorGeneratorRunner {

	public static void main(String[] args) {
		
		@SuppressWarnings("resource")
		Scanner keyboard = new Scanner(System.in);
		
		FactorGenerator ethernet = new FactorGenerator();
		
		System.out.println("Enter value:");
		int vincentestápoggers = keyboard.nextInt();
		
		ethernet.displayAllFactors(vincentestápoggers);
		
	}
}