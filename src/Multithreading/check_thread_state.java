package Multithreading;

public class check_thread_state extends Thread{
	public void run(){  
		System.out.println("thread is running...");  
		}  
	public static void main(String args[]){  
		check_thread_state t1=new check_thread_state();  
	t1.start(); 
	 }  
}
