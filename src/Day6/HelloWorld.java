package Day6;

public class HelloWorld {
	public static void main(String[] args) {
		greet();
		greet("DEVANSH");
		greet("Devansh", 21);
	}
	public static void greet() { System.out.println("Hello!");}
	public static void greet(String name) { System.out.printf("Hello, %s! \n",name);}
	public static void greet(String name, int age) { System.out.printf("Hello, %s! You are %d years old",name,age);}
}
