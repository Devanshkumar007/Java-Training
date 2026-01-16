package Collection_AND_WrapperClass;

import java.util.HashSet;
import java.util.Iterator;

public class Set1 {
	public static void main(String[] args) {
		HashSet hs = new HashSet();
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
