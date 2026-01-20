package FunctionalProgramming;

import java.util.List;

interface I1{
	int add(int a, int b);
}

public class MethodReferencing {
	public static void main(String[] args) {
		I1 obj = Integer::sum ;
		System.out.println(obj.add(10, 20));
		
		List<String> names = List.of("Devansh","Sher","Cheetah","Suraj");
		names.forEach(System.out::println);
	}
}
