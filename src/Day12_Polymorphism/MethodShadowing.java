package Day12_Polymorphism;

class Father1 {
	public static void demo() {
		System.out.println("Father's Demo");
	}
	
	
}

class Son1 extends Father1{
	public static void demo() {
		System.out.println("Son's Demo");
	}
}

public class MethodShadowing {
	public static void main(String[] args) {
		System.out.println("Father object stored in father ref");
		Father1 ref = new Father1();
		ref.demo();
		
		System.out.println("\nSon object stored in Son ref");
		Son1 ref2 = new Son1();
		ref2.demo();

		System.out.println("\nUpcasting");
		Father1 ref3 = new Son1();
		ref3.demo() ;
		
		
		System.out.println("\nDowncasting");
		Son1 ref4 = (Son1)(ref3);
		ref4.demo() ;
	}
}
