package Collection_AND_WrapperClass;

import java.util.ArrayList;
import java.util.List;

public class CollectionEx9 {
	public static void main(String[] args) {
		int[] arr = {10,21,23,24,25,26,28,22,23,21,24,25,26,25,27,25,25,25,25,25,25,25,25,24};
		List<Integer> ls = new ArrayList<>();
		
		for(int i : arr) ls.add(i);
		
		System.out.println(ls);
		
		
		int i= 0;
		while(i<ls.size()) {
			if(ls.get(i) %2 !=0 ) ls.remove(i);
			else i++;
		}
		
		System.out.println(ls);
		
	}
}
