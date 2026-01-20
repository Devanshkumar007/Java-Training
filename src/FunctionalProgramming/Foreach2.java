package FunctionalProgramming;

import java.util.List;

public class Foreach2 {
	public static void main(String[] args) {
		List<String> names = List.of("Devansh","Sher","Cheetah","Bhediya","Bhalu","Girish","Nitish");
		
		names.forEach(a-> {
			String regex = ".*sh$";
			if(a.matches(regex)) System.out.print(a+" ");
		});

		
		System.out.println("\n----------------\n");
		names.forEach(a-> {
			if(a.endsWith("sh")) System.out.print(a+" ");
		});
		
		
	}
}
