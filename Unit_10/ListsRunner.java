
import java.util.ArrayList;

public class ListsRunner {
	
	public static void main(String[] args) {
		
		Lists obj = new Lists();
		ArrayList<String> names = obj.getNames();
		
		//sorts
		obj.sortList(names);
		obj.displayList(names);
		
		//adds string
		obj.addNameToList(names, "joe");
		obj.displayList(names);
		
		//removes strings
		obj.removeFromList(names, "joe");
		obj.displayList(names);
	}
}
