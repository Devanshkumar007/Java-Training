package Collection_AND_WrapperClass;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.List;

public class SetExQ {
	public static void main(String[] args) {
		Integer[] arr = {10,12,13,12,14,14,null,15,11,10,16,null,10};
		List<Integer> ls = new ArrayList<>(Arrays.asList(arr));
		System.out.println("ls: "+ls);
		LinkedHashSet<Integer> hs = new LinkedHashSet<>(ls);
		ls = new ArrayList<>(hs);		
		System.out.println("ls: "+ls);
		
		
		
	}
}
