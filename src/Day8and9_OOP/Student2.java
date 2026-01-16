package Day8and9_OOP;

import java.util.Arrays;

public class Student2 {
	int id ;
	String name;
	int[] marks;
	public Student2(int id, String name, int[] marks) {
		super();
		this.id = id;
		this.name = name;
		this.marks = marks;
	}
	public Student2(Student2 s) {
		super();
		this.id =s.id ;  
		this.name = s.name ;
		this.marks = s.marks.clone();
	}
	
	@Override
	public String toString() {
		return "Student2 [id=" + id + ", name=" + name + ", marks=" + Arrays.toString(marks) + "]";
	}
	
	public static void main(String[] args) {
		Student2 s1 = new Student2(1,"Devansh", new int[]{80,90,100});
		Student2 s2 = new Student2(s1);
		s2.marks[0] = 100 ;
		System.out.println(s1);
		System.out.println(s2);
		
		
	}
}
