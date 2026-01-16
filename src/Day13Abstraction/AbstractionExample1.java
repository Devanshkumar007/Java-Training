package Day13Abstraction;

abstract class Father{
	abstract public void demo();
	abstract public int add(int a, int b);
	
}

class Son extends Father{

	@Override
	public void demo() {
		// TODO Auto-generated method stub
		System.out.println("Demo called");
	}

	@Override
	public int add(int a, int b) {
		// TODO Auto-generated method stub
		return a+b;
	}
	
}

public class AbstractionExample1 {
	public static void main(String[] args) {
		Father ref = new Son();
		ref.demo();
		System.out.println(ref.add(10, 50));
	}
}
