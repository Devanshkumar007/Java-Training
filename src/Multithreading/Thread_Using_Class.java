package Multithreading;

public class Thread_Using_Class extends Thread{
	public void run() {
		System.out.println("Thread running");
	}
	public static void main(String[] args) {
		Thread_Using_Class t = new Thread_Using_Class();
		t.start();
	}

}
