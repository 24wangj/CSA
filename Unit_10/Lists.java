
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
	
	public void displayList(ArrayList<String> arr) {
		
		for (int i = 1; i < arr.size(); i++) {
			System.out.print(arr.get(i));
			if (i < arr.size() - 1) {
				System.out.print(", ");
			}
		}
		System.out.println("");
	}
	
	public int getIndexOfFirst(ArrayList<String> arr, int startLoc) {
		int indexOfFirst = startLoc;
		for (int i = startLoc; i < arr.size(); i++) {
			if (arr.get(i).compareTo(arr.get(indexOfFirst)) < 0) {
				indexOfFirst = i;
			}
		}
		return indexOfFirst;
	}
	
	public void sortList(ArrayList<String> arr) {
		
		for (int i = 0; i < arr.size(); i++) {
			String temp = arr.get(getIndexOfFirst(arr, i));
			arr.set(getIndexOfFirst(arr, i), arr.get(i));
			arr.set(i, temp);
		}
	}
	
	public void addNameToList(ArrayList<String> arr, String newName) {
		
		arr.add(newName);
		sortList(arr);
	}
	
	public void removeFromList(ArrayList<String> arr, String remove) {
		
		while (arr.contains(remove)) {
			arr.remove(remove);	
		}
	}
} 
