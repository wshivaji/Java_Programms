package Java_Collection;

import java.util.Iterator;
import java.util.LinkedList;

public class LInked_list {
	public static void main(String args[]) {
		
		LinkedList<String> ll = new LinkedList<String>();
		ll.add("Text 1");
		ll.add("Text 2");
		ll.add("Text 3");
		ll.add("Text 4");
		ll.add("Text 5");
		
		Iterator<String> itr = ll.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
	}
}
