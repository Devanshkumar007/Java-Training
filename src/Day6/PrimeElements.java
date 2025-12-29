package Day6;

public class PrimeElements {
	public static void main(String[] args) {
		int[] arr = {1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20};
		
		for(int i : arr) {
			if(isPrime(i)) System.out.println(i);
		}
	
	}
	
	public static boolean isPrime(int n) {
		if(n==1) return false ;
		for(int i=2; i<=n/2 ; i++) {
			if(n%i==0) return false;
		}
		return true;
	}
}
