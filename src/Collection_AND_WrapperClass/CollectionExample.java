package Collection_AND_WrapperClass;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class CollectionExample {
	public static void main(String[] args) {
		List al = new ArrayList();
		al.add(10);  // return type of add is boolean true of added false if not 
		al.add('d'); // add(Object obj) : Boolean
		al.add("Deva");
		al.add(false);
		al.add(20.10);
		al.add(null);
		// al is of nin generric type and can store any object 
		al.get(2); // get(int index) : Object  return type Object
		
		System.out.println(al); //toString is overriden 
		
		System.out.println(al.size()); // size(): int  gives length of list 
		
//		Collection.sort(al);
		List al2 = new ArrayList();
		al2.add(10);
		al2.add(null);
		al.removeAll(al2);
		System.out.println(al);  
	}
}
