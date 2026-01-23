package Multithreading;

class Tasks extends Thread{
	public void run() {
		for(int i=0 ;i<5; i++) {
			System.out.println(i+"Devansh");
		}
	}
}

public class JoinExample {
	public static void main(String[] args) throws InterruptedException {
		Tasks t1 = new Tasks();
		t1.start();
		t1.join(2000);
		for(int i=0; i<5; i++) {
			System.out.println(i+"Suraj");
		}
	}
}
