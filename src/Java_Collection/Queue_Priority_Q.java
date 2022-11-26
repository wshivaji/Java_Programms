package Java_Collection;

import java.util.Iterator;
import java.util.PriorityQueue;
import java.util.Queue;

public class Queue_Priority_Q {
	public static void main(String args[]) {
		Queue<String> Q = new PriorityQueue();
		Q.add("Text 1");
		Q.add("Text 2");
		Q.add("Text 3");
		Q.add("Text 4");
		Q.add("Text 5");
		Q.add("Text 6");
		System.out.println("Head: "+Q.element());
		System.out.println("Head: "+Q.peek());
		System.out.println("Iterating through Q");
		Iterator<String> itr = Q.iterator();
		while(itr.hasNext()) {
			System.out.println(" "+ itr.next());
		}
		System.out.println("*******************************");
		Q.remove();
		Iterator<String> itr1 = Q.iterator();
		while(itr1.hasNext()) {
			System.out.println(itr1.next());
		}
		System.out.println("*******************************");
		Q.poll();
		Iterator<String> itr3 = Q.iterator();
		while(itr3.hasNext()) {
			System.out.println(itr3.next());
		}
	}
}
