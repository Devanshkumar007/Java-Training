package Collection_AND_WrapperClass;

import java.util.PriorityQueue;

public class PriorityQueueEx {
	public static void main(String[] args) {
		PriorityQueue<Task> pq = new PriorityQueue<>( (a,b) -> a.priority - b.priority);
		pq.offer(new Task("WakeUp",1));
		pq.offer(new Task("Bath",3));
		pq.offer(new Task("BrushTeeth",2));
		pq.add(new Task("BreakFast",5));
		pq.add(new Task("Sleep",0));
		
	
		
		while(!pq.isEmpty()) {
			System.out.println(pq.poll());
		}
	}
}

class Task {
    String name;
    int priority;

    Task(String name, int priority) {
        this.name = name;
        this.priority = priority;
    }

	@Override
	public String toString() {
		return name + ", priority=" + priority;
	}
}

//
//Write a Java program that uses a PriorityQueue to schedule and execute tasks based on their priority (lower number = higher priority). You should:
//Create a Task class with name and priority.
//Store tasks in a PriorityQueue<Task> so that tasks with higher priority (i.e., lower priority value) are processed first.
//Add at least 5 tasks with different priorities.
//Print the tasks in the order they are executed.
//In a priority queue, elements are ordered based on priority (not insertion order). 
//By default Java’s PriorityQueue behaves like a min-heap, meaning the smallest element is at the head.