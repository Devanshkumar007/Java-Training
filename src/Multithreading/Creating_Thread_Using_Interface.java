package Multithreading;

public class Creating_Thread_Using_Interface implements Runnable {
    public void run() {
        System.out.println("Runnable thread running");
    }

    public static void main(String[] args) {
    	Creating_Thread_Using_Interface ref = new Creating_Thread_Using_Interface();
        Thread t = new Thread(ref);
        t.start();
    }
}
