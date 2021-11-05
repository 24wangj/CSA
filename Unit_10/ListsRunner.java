
import java.util.ArrayList;

public class ListsRunner {
	
	public static void main(String[] args) {
		
		Lists obj = new Lists();
		ArrayList<String> names = obj.getNames();
		
		obj.sortList(names);
		
		for (String i : names) {
			System.out.println(i);
		}
	}
}