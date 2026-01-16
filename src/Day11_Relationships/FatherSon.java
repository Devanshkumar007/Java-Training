package Day11_Relationships;

class Father{
	static void father() {
		System.out.println("Father");
	}
}

class Son extends Father{
	static void son() {
		System.out.println("Son");
	}
}
public class FatherSon {
	public static void main(String[] args) {
		Son.father();
	}
}
