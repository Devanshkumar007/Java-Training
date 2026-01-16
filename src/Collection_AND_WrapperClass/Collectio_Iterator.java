package Collection_AND_WrapperClass;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;

public class Collectio_Iterator {
	public static void main(String[] args) {
		Integer[] arr = {10,20,30,40,50,60};
		ArrayList<Integer> ls = new ArrayList<>(Arrays.asList(arr));
		
		Iterator itr = ls.iterator();
		
		while(itr.hasNext()) {
			System.out.println(ls);
			itr.next();
			itr.remove();
		}
		System.out.println(ls);
		
	}
}
