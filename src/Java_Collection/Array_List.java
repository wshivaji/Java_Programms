package Java_Collection;

import java.util.ArrayList;
import java.util.Iterator;



public class Array_List {
	public static void main(String args[]) {
		
		ArrayList<String> list = new ArrayList<String>();
		list.add("Text 1");
		list.add("Test 2");
		list.add("Text 3");
		list.add("Text 4");
		list.add("Text 5");
		
		Iterator itr = list.iterator();
		
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
		
		
	}
}
