package Day6_Arrays;

public class NumberRecursion {
	public static void main(String[] args) {
		range(1,1001);
	}
	
	public static void range(int i, int n) {
		if(i==n) return;
		System.out.println(i);
		range(i+1, n);
	}
}
