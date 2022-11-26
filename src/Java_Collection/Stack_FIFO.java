package Java_Collection;

import java.util.Iterator;
import java.util.Stack;

public class Stack_FIFO {

	public static void main(String args[]) {
		
		Stack<String> st = new Stack<String>();
		st.push("Text 1");
		st.push("Text 2");
		st.push("Text 3");
		st.push("Text 4");
		st.push("Text 5");
		st.push("Text 6");
		st.pop();
		Iterator<String> itr = st.iterator();
		while (itr.hasNext()) {
			System.out.println(itr.next());
		}
	}
}
