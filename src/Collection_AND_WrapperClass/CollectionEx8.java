package Collection_AND_WrapperClass;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class CollectionEx8 {
	public static void main(String[] args) {
		String[] s = {"Mridul","Girish","Suraj","Devansh"};
		List<String> ls = new ArrayList<>(Arrays.asList(s));
		System.out.println(ls);
		
		String find = new Scanner(System.in).next();
		
		if(ls.contains(find)) {
			System.out.println(find+" present at "+ls.indexOf(find));
		}else {
			System.out.println("ABSENT");
		}
		
	}
}
