package FunctionalProgramming;

import java.util.Arrays;
import java.util.List;

public class ForEachLoopEx {
	public static void main(String[] args) {
		List<String> names = List.of("Devansh","Sher","Cheetah","Bhediya","Bhalu","Girish","Nitish");
		names.forEach(a-> System.out.print(a+" "));
		System.out.println("\n---------------\n");
		
		List<Integer> values = Arrays.asList(1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20);
		values.forEach(a-> {
			if(a%2==0) System.out.print(a+" ");
		});
		System.out.println("\n---------------\n");
		

		
	}
}
