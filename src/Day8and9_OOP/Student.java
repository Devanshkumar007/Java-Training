package Day8and9_OOP;

public class Student {
	int id ;
	String name;
	double percentage;
	static String college = "LPU";
	
	public Student() {
		super();
	}
	public Student(int id) {
		this.id = id ;
	}
	public Student(int id, String name) {
		this.id = id ;
		this.name= name ;
	}
	public Student(int id, double perc) {
		this.id = id ;
		this.percentage= perc;
	}
	public Student(String name) {
		this.name = name;
	}
	public Student(String name, double perc) {
		this.name = name;
		this.percentage = perc ;
	}
	public Student(double percentage) {
		this.percentage = percentage ;
	}
	
	public Student(int id ,String name, double perc) {
		this.name = name;
		this.percentage = perc ;
	}
	
	public static void printDetails(Student s) {
		System.out.println("Student [id=" + s.id + ", name=" + s.name + ", percentage=" + s.percentage + "%, college=" + s.college + "]");
	}
	
	
	public static void main(String[] args) {
		Student s1 = new Student();
		Student s2 = new Student(1);
		Student s3 = new Student("Devansh");
		Student s4 = new Student(80.00);
		Student s5 = new Student(2,"Mridul");
		Student s6 = new Student(3,50.00);
		Student s7 = new Student("Deva",90.00);
		
		printDetails(s1);
		printDetails(s2);
		printDetails(s3);
		printDetails(s4);
		printDetails(s5);
		printDetails(s6);
		printDetails(s7);
	}
	
	
	
	
	
	
	
	
}
