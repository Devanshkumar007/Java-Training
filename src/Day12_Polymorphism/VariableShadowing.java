package Day12_Polymorphism;

class Father{
	static int a = 10 ;
	int b = 10;
}

class Son extends Father{
	int a = 20;
	static int b = 20;
}


public class VariableShadowing {
	public static void main(String[] args) {
		System.out.println("Father object stored in father ref");
		Father ref = new Father();
		System.out.println(ref.a);
		System.out.println(ref.b);
		
		System.out.println("\nSon object stored in Son ref");
		Son ref2 = new Son();
		System.out.println(ref2.a);
		System.out.println(ref2.b);

		System.out.println("\nUpcasting");
		Father ref3 = new Son();
		System.out.println(ref3.a);
		System.out.println(ref3.b);
		
		
		System.out.println("\nDowncasting");
		Son ref4 = (Son)(ref3);
		System.out.println(ref4.a);
		System.out.println(ref4.b);
		
//		System.out.println("Son.a && Son.b" +Son.a+" "+Son.b);
		
		
		
	}
}
