
import java.util.ArrayList;
import java.util.Scanner;


public class Lists {

	public ArrayList<String> getNames() {
		
		Scanner keyboard = new Scanner(System.in);
		ArrayList<String> names = new ArrayList<String>();
		
		System.out.println("How many names would you like to enter?");
		int length = keyboard.nextInt();
		
		for (int i = 1; i <= length; i++) {
			names.add(keyboard.nextLine());
			System.out.println("Enter name (" + i + "):");
		}
		names.add(keyboard.nextLine());
		keyboard.close();
		
		return names;
	}
	
	public void sortList(ArrayList<String> theList) {
		
	}
}
