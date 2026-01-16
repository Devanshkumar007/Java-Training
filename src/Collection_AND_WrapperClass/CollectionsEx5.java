package Collection_AND_WrapperClass;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class CollectionsEx5 {
	public static void main(String[] args) {
		List<Integer> ls = new ArrayList<>();
		ls.add(10);
		ls.add(5);
		ls.add(20);
		ls.add(15);
		ls.add(25);
		
		ls.add(2,12);
		
		System.out.println(ls);
		
		System.out.println(ls.contains(15)?"Contains 15":"Donot contain 15");
		
		Collections.sort(ls);
		
		ls.remove(Integer.valueOf(5));
		
		
//		for(int i=0;i<ls.size(); i++) {
//			if(ls.get(i)==5) {
//				ls.remove(i);
//			}
//		}
	
		System.out.println(ls+" size: "+ls.size());

	}
}

//Write a Java program that performs the following using an ArrayList of integers:
//- Add the following numbers to the list: 10, 5, 20, 15, 25.
//- Insert the number 12 at index 2.
//- Print all elements of the list.
//- Check if the number 15 exists in the list and print an appropriate message.
//- Sort the list in ascending order.
//- Remove the number 5 from the list.
//- Print the final list and its size.