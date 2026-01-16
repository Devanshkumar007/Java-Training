package Day14Interfaces;


interface Father1{
	static int a =10; // automatiically prefixed with final keyword with them      final static int a = 10;
	int b= 20 ;	// automatically prefixed with both final and static 			   final static int b = 20;
	
	
	//Static methods can only be called in a static way only and cannot be overriden  
	public static void test() {
		System.out.println("Test called");
	}
	
	//can be called using a object and cannot be override 
	public default void demo() {
		System.out.println("Demo called");
	}
	abstract public void abs();
}


class Son1 implements Father1{

	@Override
	public void abs() {
		// TODO Auto-generated method stub
		System.out.println("Abs Called");
	}
}

public class Ex2 {
	public static void main(String[] args) {
		Father1 obj = new Son1();
	//	obj.a; // CTE Cannot access astatic members and functions in a non static way
		System.out.println(Father1.a);
		Father1.test();
		obj.demo();
		obj.abs();
		
		System.out.println(obj.getClass());
		
	}
}
