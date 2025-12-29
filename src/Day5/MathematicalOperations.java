package Day5;

public class MathematicalOperations {
	public static void main(String[] args) {
		System.out.println(max(2,7,10));
		System.out.println(min(2,7,10));
		System.out.println(fibonacci(10));
		System.out.println(isPrime(23));
	}
	
	public static int max(int a, int b,int c) {
		return (int) Math.max(a, Math.max(b, c)) ;
	}
	public static int min(int a, int b,int c) {
		return (int) Math.min(a, Math.min(b, c)) ;
	}
	
	public static int fibonacci(int n) {
		if(n==0 || n==1) return n ;
		return fibonacci(n-1) + fibonacci(n-2);
	}
	
	
	public static boolean isPrime(int n) {
		if(n==1) return false ;
		for(int i=2; i<=n/2 ; i++) {
			if(n % i == 0) return false;
		}
		return true;
	}
	
	
}
