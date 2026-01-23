package Multithreading;

public class ThreadScheduler extends Thread{

	@Override
	public void run() {
		// TODO Auto-generated method stub
		System.out.println(Thread.currentThread().getName());
	}
	
	public static void main(String[] args) {
		ThreadScheduler t1 = new ThreadScheduler();
		ThreadScheduler t2 = new ThreadScheduler();
		ThreadScheduler t3 = new ThreadScheduler();
		ThreadScheduler t5 = new ThreadScheduler();
		ThreadScheduler t4 = new ThreadScheduler();
		
		t1.start();
		t2.start();
		t3.start();
		t4.start();
		t5.start();
		
	}
}
