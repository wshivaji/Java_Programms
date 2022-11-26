package Java_Collection;

import java.util.Iterator;
import java.util.TreeSet;

public class TreeSet_table {
	public static void main(String args[]) {
		TreeSet<String> ts=new TreeSet<String>();
		ts.add("Text 1");
		ts.add("Text 2");
		ts.add("Text 3");
		ts.add("Text 1");
		ts.add("Text 5");
		ts.add("Text 6");
		Iterator<String> itr = ts.iterator();
		while (itr.hasNext()) {
			System.out.println(itr.next());
		}
	}
}
