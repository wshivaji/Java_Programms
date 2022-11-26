package Java_Collection;

import java.util.HashSet;
import java.util.Iterator;

public class HashSet_table {
	public static void main(String args[]) {
		
		HashSet<String> hs = new HashSet<String>();
		hs.add("Text 1");
		hs.add("Text 2");
		hs.add("Text 3");
		hs.add("Text 4");
		hs.add("Text 5");
		hs.add("Text 6");
		Iterator<String> itr = hs.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
	}
}
