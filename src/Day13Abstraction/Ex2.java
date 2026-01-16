package Day13Abstraction;

abstract class Father1{
	
	static {
		System.out.println("SIB CALLED");
	}
	
	{
		System.out.println("IIB CALLED");
	}
	
	static int x = 10; 
	int y = 20 ;
	
	Father1(){
		System.out.println("Constructor called");
	}
	
	public void demo() {
		System.out.println("Demo called");
	}
	public static void test() {
		System.out.println("Static method called");
	}
	abstract void abs();
}

class Son1 extends Father1{

	@Override
	void abs() {
		// TODO Auto-generated method stub
		System.out.println("Abstract method called");
	}
	
}


public class Ex2 {
	public static void main(String[] args) {
		System.out.println("MAIN");
		
		System.out.println(Father1.x);
		
		Father1 ref1 = new Son1();
		ref1.demo();
		ref1.abs();
		ref1.test();
	}
}
