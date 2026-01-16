package Day8and9_OOP;

public class OverloadingMain {
	public static void main(String[] args) {
		System.out.println("String using args");
		System.out.println(args[0]);
	}
	
	public static void main(int x) {
		System.out.println("Passing int");
		System.out.println(x);
	}
	public static void main(String s) {
		System.out.println("Passing String directly");
		System.out.println(s);
	}
	
}
