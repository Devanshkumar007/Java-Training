package Day14Interfaces;

interface Father{
	void demo();
	int add(int a, int b);	
}
class Son implements Father{
	@Override
	public void demo() {
		System.out.println("Demo Method");
	}
	@Override
	public int add(int a, int b) {
		return a+b;
	}	
}
public class InterfaceExample1 {
	public static void main(String[] args) {
		Father obj = new Son();
		obj.demo();
		System.out.println(obj.add(10, 20));
	}
}
