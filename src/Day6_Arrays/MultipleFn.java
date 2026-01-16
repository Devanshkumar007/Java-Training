package Day6_Arrays;

public class MultipleFn {
	public static void main(String[] args) {
		System.out.printf("Add %d %d = %d \n",10,20,add(10,20));
		System.out.printf("Add %d %d %d = %d \n",10,20,30,add(10,20,30));
		System.out.printf("Add %d %d %d %d = %d \n",10,20,30,40,add(10,20,30,40));
		System.out.printf("Subtract %d %d = %d \n",10,20,sub(10,20));
		System.out.printf("Subtract %d %d %d= %d \n",10,20,30,sub(10,20,30));
		System.out.printf("Subtract %d %d %d %d= %d \n",10,20,30,40,sub(10,20,30,40));
		System.out.printf("Multiply %d %d = %d \n",10,20,mult(10,20));
		System.out.printf("Multiply %d %d %d= %d \n",10,20,30,mult(10,20,30));
		System.out.printf("Multiply %d %d %d %d= %d \n",10,20,30,40,mult(10,20,30,40));
		System.out.printf("Division %d %d = %d \n",10,20,30,40,div(10,20));
		System.out.printf("Division %d %d %d = %d \n",10,20,30,div(10,20,30));
		System.out.printf("Division %d %d %d %d= %d \n",10,20,30,40,div(10,20,30,40));
	}
	
	public static int mult(int a, int b) {
		return a*b;
	}
	public static int mult(int a, int b, int c) {
		return a*b*c;
	}
	public static int mult(int a, int b, int c, int d) {
		return a*b*c*d;
	}
	public static int add(int a, int b) {
		return a+b;
	}
	public static int add(int a, int b, int c) {
		return a+b+c;
	}
	public static int add(int a, int b, int c, int d) {
		return a+b+c+d;
	}
	public static int div(int a, int b) {
		return a/b;
	}
	public static int div(int a, int b, int c) {
		return a/b/c;
	}
	public static int div(int a, int b, int c, int d) {
		return a/b/c/d;
	}
	public static int sub(int a, int b) {
		return a-b;
	}
	public static int sub(int a, int b, int c) {
		return a-b-c;
	}
	public static int sub(int a, int b, int c, int d) {
		return a-b-c-d;
	}

}
