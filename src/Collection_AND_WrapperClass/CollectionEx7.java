package Collection_AND_WrapperClass;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CollectionEx7 {
	public static void main(String[] args) {
		Integer[] arr = {1,3,5,7,9,2,5,8};
		List<Integer> ls = new ArrayList<>(Arrays.asList(arr));
		//with int[] it can only work if we ref to List<int[]> 
		
		int[] arr2 = {1,3,5,7,9,2,5,8};
		List<Integer> ls2 = new ArrayList<>();
		
		for(int i : arr2) ls2.add(i);
		
		
		ls.forEach(a -> System.out.print(a+" "));
		System.out.println("\n");
		ls2.forEach(a -> System.out.print(a+" "));
		
		
	}
}


//Q. WAJP to convert all the elemets of array into List.
//
//Q. WAJP to create array which can store different type of data.
//	= {10,"LPU",'a',null,false,10.5}
//	
//Q. WAJP to convert all the elements of List into Array.