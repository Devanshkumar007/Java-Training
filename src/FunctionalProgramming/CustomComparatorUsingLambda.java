package FunctionalProgramming;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class CustomComparatorUsingLambda {
	public static void main(String[] args) {
		List<Student> ls = new ArrayList<>();
		ls.add(new Student(3,"Devansh",90));
		ls.add(new Student(5,"Sher",77.6));
		ls.add(new Student(7,"Cheetah",77.8));
		ls.add(new Student(1,"Bhalu",77.9));
		ls.add(new Student(6,"Bhediya",80));
		ls.add(new Student(2,"Goat",77));
		
		
		Collections.sort(ls, (a,b)-> a.id-b.id);
		System.out.println("Sorted by id: ");
		ls.forEach(System.out::println);
		System.out.println("\n-------------------------------\n");
		
		
		
		//Creating a object of Comparator 
		Comparator<Student> byName = (s1,s2)-> s1.name.compareToIgnoreCase(s2.name);
		Collections.sort(ls, byName);
		System.out.println("Sorted by name: ");
		ls.forEach(System.out::println);
//		Collections.sort(ls, Comparator<T>); // By default .sort methods is overriden to expect 2 inputs 
//		first the Collection and second the comparator so we can directly use lamba epression there  
		System.out.println("\n-------------------------------\n");
		
		
		
		
		Collections.sort(ls, (a,b)-> -1*Double.compare(a.marks,b.marks));
		System.out.println("Sorted by marks: (Descending)");
		ls.forEach(System.out::println);
//		System.out.println("\n-------------------------------\n");
	}
}


class Student{
	int id;
	double marks;
	String name;
	public Student(int id, String name, double marks) {
		super();
		this.id = id;
		this.marks = marks;
		this.name = name;
	}
	@Override
	public String toString() {
		return "Student [id=" + id + ", marks=" + marks + ", name=" + name + "]";
	}
	
	
}
