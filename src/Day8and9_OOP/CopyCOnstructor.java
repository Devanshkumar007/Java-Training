package Day8and9_OOP;

public class CopyCOnstructor {

	int id;
	String name;
	public CopyCOnstructor(CopyCOnstructor c) {
		super();
		this.id=c.id;
		this.name = c.name;
	}
	public CopyCOnstructor(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}
	@Override
	public String toString() {
		return "CopyCOnstructor [id=" + id + ", name=" + name + "]";
	}
	
	public static void main(String[] args) {
		CopyCOnstructor c1 = new CopyCOnstructor(1,"Devansh");
		CopyCOnstructor c2 = new CopyCOnstructor(c1);
		System.out.println(c1.toString());
		System.out.println("COPY CONSTRUCTOR");
		System.out.println(c2.toString());
	}
}
