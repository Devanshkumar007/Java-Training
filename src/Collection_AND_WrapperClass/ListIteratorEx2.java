package Collection_AND_WrapperClass;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.ListIterator;

public class ListIteratorEx2 {
	public static void main(String[] args) {
		String[] names = {"Sher","Cheetah","Bhalu","Bhediya"};
		List<String> ls = new ArrayList<>(Arrays.asList(names));
		
		ListIterator itr = ls.listIterator();
		
		System.out.println(ls);
		while(itr.hasNext()) {
			itr.next();
		}
		
		while(itr.hasPrevious()) {
			itr.remove();
			itr.previous();
			System.out.println(ls);
		}
		
//		ls.listIterator(int index) overloaded function points the iterator at a particular index
		
		
		
	}
}
