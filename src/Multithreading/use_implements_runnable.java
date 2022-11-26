package Multithreading;

public class use_implements_runnable implements Runnable {
	public void run() {
		System.out.println("Thread is running...");
	}
	
	public static void main(String args[]) {
		use_implements_runnable r1 = new use_implements_runnable();
		Thread t1 = new Thread(r1);
		t1.start();
	}
		
}
