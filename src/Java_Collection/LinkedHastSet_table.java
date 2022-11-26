package Java_Collection;

import java.util.Iterator;
import java.util.LinkedHashSet;

public class LinkedHastSet_table {
	public static void main(String args[]) {
		
		LinkedHashSet<String> lhs = new LinkedHashSet<String>();
		lhs.add("Text 1");
		lhs.add("Text 2");
		lhs.add("Text 3");
		lhs.add("Text 4");
		lhs.add("Text 5");
		lhs.add("Text 6");
		Iterator<String> itr = lhs.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
	}
}
