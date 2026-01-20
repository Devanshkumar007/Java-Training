package Comparator_And_CustomComparable;

import java.util.ArrayList;
import java.util.Collections;

public class ComparatorUnderstanding {
	public static void main(String[] args) {
		ArrayList<Student> al = new ArrayList<>();
		al.add(new Student(1,"Devansh",90.9));
		al.add(new Student(4,"Bhalu",90.1));
		al.add(new Student(5,"Bhediya",90.2));
		al.add(new Student(3,"Cheetah",90.3));
		al.add(new Student(2,"Sher",90.5));
		al.add(new Student(0,"Deva",100));
		
		System.out.println("Before Sorting: ");
		al.forEach(System.out::println);
		Collections.sort(al);
		System.out.println("After Sorting: ");
		al.forEach(System.out::println);
		
		
		//if we try to sort any custom object without implementing compareTo it will give compile time error 
		
			String s1 = "A";
			s1.compareToIgnoreCase(s1);
		
		
	}
}

class Student implements Comparable<Student>{
	int id ;
	String name;
	double marks;
	
	public Student(int id, String name, double marks) {
		super();
		this.id = id;
		this.name = name;
		this.marks = marks;
	}

	@Override
	public String toString() {
		return "Student [id=" + id + ", name"
				+ "=" + name + ", marks=" + marks + "]";
	}

	@Override
	public int compareTo(Student o) {
		return Double.compare(this.marks, o.marks);
	}
	
}
