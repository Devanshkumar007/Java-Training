package Collection_AND_WrapperClass;

import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;

public class LinkedHashSet1 {
	public static void main(String[] args) {
		Set hs = new LinkedHashSet();
		hs.add(10);
		hs.add(null);
		hs.add('a');
		hs.add("LPU");
		hs.add("Sher");
		hs.add(10);
		hs.add('a');
		hs.add(10.00);
		hs.add(true);

		System.out.println(hs);
		System.out.println();
		
		for(Object obj :  hs) System.out.print(obj+" ");
		System.out.println();
		
		Iterator itr = hs.iterator();
		while(itr.hasNext()) {
			System.out.print(itr.next()+" ");
		}
		
	}
	}
