
import java.util.ArrayList;

public class ListsRunner {
	
	public static void main(String[] args) {
		
		Lists obj = new Lists();
		ArrayList<String> names = obj.getNames();
		
		//sorts
		System.out.print("\nSorted: ");
		obj.sortList(names);
		obj.displayList(names);
		
		//adds string
		System.out.print("Added: ");
		obj.addNameToList(names, "joe");
		obj.displayList(names);
		
		//removes strings
		System.out.print("Removed: ");
		obj.removeFromList(names, "joe");
		obj.displayList(names);
	}
}
