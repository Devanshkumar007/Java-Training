package Day8and9_OOP;

public class ConstructorChaining {
	int id ;
	String name ;
	double salary ;
	
	public ConstructorChaining(){
		this.id = 101 ;
		this.name = "unknown";
		this.salary = 50000;
					
	}
	public ConstructorChaining(int id) {
		this();
		this.id = id;
	}
	public ConstructorChaining(String name) {
//		this();
		this(1);
		this.name= name;
	}
	
	public static void main(String[] args) {
		ConstructorChaining c1 = new ConstructorChaining();
		System.out.println(c1.id);
		System.out.println(c1.name);
		System.out.println(c1.salary);
		
		ConstructorChaining c2 = new ConstructorChaining("Devansh");
		System.out.println(c2.id);
		System.out.println(c2.name);
		System.out.println(c2.salary);
		
	}
}
