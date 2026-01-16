package Day12_Polymorphism;
	
class Father2{
	public void demo() {
		System.out.println("Father's Demo");
	}
}
class Son2 extends Father2{
	public void demo() {
		System.out.println("Son's Demo");
	}
}

public class MethodOverriding {
	public static void main(String[] args) {
		System.out.println("Father object stored in father ref");
		Father2 ref = new Father2();
		ref.demo();
		
		System.out.println("\nSon object stored in Son ref");
		Son2 ref2 = new Son2();
		ref2.demo();

		System.out.println("\nUpcasting");
		Father2 ref3 = new Son2();
		ref3.demo() ;
		
		System.out.println("\nDowncasting");
		Son2 ref4 = (Son2)(ref3);
		ref4.demo() ;
	}
}
