package Multithreading;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

class Task implements Runnable {

    int taskId;

    Task(int taskId) {
        this.taskId = taskId;
    }

    @Override
    public void run() {
        System.out.println(
            "Task " + taskId +
            " executed by " +
            Thread.currentThread().getName()
        );
    }
}

public class Create_Threadpool {

    public static void main(String[] args) {

        ExecutorService service = Executors.newFixedThreadPool(3);

        for (int i = 1; i <= 6; i++) {
            service.execute(new Task(i));
        }

        service.shutdown();
    }
}