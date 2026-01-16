package Collection_AND_WrapperClass;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class LinkedListEx {
	public static void main(String[] args) {
		//Traverse all the element of a linked list in forward as well as backward diretion 
		Integer[] arr = {10,20,30,40,50,60,70,80,90,100};
		List<Integer> ls = new LinkedList<>(Arrays.asList(arr));

		System.out.println("=======Forward========");
		ls.forEach(a -> System.out.print(a+" ") );
		System.out.println("\n=======Backward=======");
		for(int i=ls.size()-1 ; i>=0; i--) System.out.print(ls.get(i)+" ");
	}
}
