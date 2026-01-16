package Day8and9_OOP;

// WAJP TO EXECUTE INTANCE INTILIZER BLOCK & NON STATIC METHODS BEFORE THE EXECUTION OF MAIN


public class TrickyQuestion1 {
	static {
		System.out.println("STATIC BLOCK");
		TrickyQuestion1 obj = new TrickyQuestion1();
		System.out.println(obj);
	}
	//NON STATIC BLOCK
	{	
		System.out.println("NON STATIC BLOCK");
		test1();	test2();
	}
	public void test1() {
		System.out.println("TEST 1");
	}
	public void test2() {
		System.out.println("TEST 2");
	}
	public static void main(String[] args) {
		System.out.println("MAIN METHOD");
	}
}





