package Collection_AND_WrapperClass;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.ListIterator;

public class Collection_ListIterator {
	public static void main(String[] args) {
		String[] names = {"Suraj","Mridul","Devansh","Sher","Cheetah"};
		List<String> ls = new ArrayList<>(Arrays.asList(names));
		
		ListIterator<String> itr = ls.listIterator();
		
		System.out.println("===forward===");
		while(itr.hasNext()) {
			System.out.print(itr.next()+" ");
		}
		
		System.out.println("\n===backward===");
		while(itr.hasPrevious()) {
			System.out.print(itr.previous()+" ");
		}
		
	}
}
