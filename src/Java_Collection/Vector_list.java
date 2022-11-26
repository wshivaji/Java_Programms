package Java_Collection;

import java.util.Iterator;
import java.util.Vector;

public class Vector_list {
	public static void main(String args[]) {
		
		Vector<String> vl = new Vector<String>();
		vl.add("Text 1");
		vl.add("Text 2");
		vl.add("Text 3");
		vl.add("Text 4");
		vl.add("Text 5");
		
		Iterator<String> itr = vl.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
	}
}
