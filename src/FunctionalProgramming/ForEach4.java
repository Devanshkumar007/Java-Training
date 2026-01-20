package FunctionalProgramming;

import java.util.ArrayList;
import java.util.List;

public class ForEach4 {
	public static void main(String[] args) {
		List<Student> ls = new ArrayList<>();
		ls.add(new Student(3,"Devansh",90));
		ls.add(new Student(5,"Sher",87.6));
		ls.add(new Student(7,"Cheetah",77.8));
		ls.add(new Student(1,"Bhalu",87.9));
		ls.add(new Student(6,"Bhediya",80));
		ls.add(new Student(2,"Goat",7));
		
		ls.forEach(a-> {
			if(a.marks>85) System.out.println(a+" ");
		});
		
	}
}
