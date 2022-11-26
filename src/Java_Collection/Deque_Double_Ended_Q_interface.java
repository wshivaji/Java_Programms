package Java_Collection;

import java.util.ArrayDeque;
import java.util.Deque;

public class Deque_Double_Ended_Q_interface {
	public static void main(String args[]) {
		Deque<String> dq = new ArrayDeque<String>();
		dq.add("Text 1");
		dq.add("Text 2");
		dq.add("Text 3");
		dq.add("Text 4");
		dq.add("Text 5");
		dq.add("Text 6");
		for(String str: dq) {
			System.out.print("  "+ str);
		}
	}
}
