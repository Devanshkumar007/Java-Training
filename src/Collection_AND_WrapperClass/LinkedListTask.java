package Collection_AND_WrapperClass;

import java.util.Iterator;
import java.util.LinkedList;

public class LinkedListTask {
	public static void main(String[] args) {
		LinkedList<Integer> compNumber = new LinkedList<>();
		compNumber.add(101);
		compNumber.add(102);
		compNumber.add(103);
		compNumber.add(104);
		compNumber.add(105);
		compNumber.add(106);
		
		compNumber.add(2, 999);
		Iterator<Integer> itr = compNumber.listIterator();
		System.out.println("Before : "+compNumber);
		while(itr.hasNext()) {
			if(itr.next() %2 == 0 ) itr.remove();
		}
		System.out.println("After : "+compNumber);
		
		rev(compNumber,0);
		System.out.println("Reverse: "+compNumber);
		
		
		if(compNumber.contains(Integer.valueOf(105))) {
			System.out.println("Found at index "+compNumber.indexOf(Integer.valueOf(105)));
		}else {
			System.out.println("Compartment not found");
		}
		
		
	}
	static int j=0 ;
	public static void rev(LinkedList<Integer> ls, int i) {
		if (i>=ls.size()) return;
		int curr = ls.get(i);
		rev(ls,i+1);
		ls.set(j++, curr);
	}
}

//Problem Statement
//
//You are developing a Train Compartment Management System using Java Collections.
//Each compartment is identified by a compartment number (Integer).
//
//Tasks to Perform
//	Create a LinkedList<Integer> to store compartment numbers.
//	Add compartments in the following order: 101, 102, 103, 104, 105, 106
//
//Perform the following operations step by step:
//Operations
//	Insert a VIP compartment (999): Immediately after compartment 102
//	Remove all even-numbered compartments (Use Iterator only)
//	Reverse the remaining compartments without using Collections.reverse()
//	Check whether compartment 105 exists:
//		If present → print its index
//		If not present → print "Compartment not found"