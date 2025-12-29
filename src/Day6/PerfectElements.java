package Day6;

public class PerfectElements {
	public static void main(String[] args) {
		int[] arr = {1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20};
		for(int i : arr) {
			if(isPerfect(i)) System.out.println(i);
		}
	}
	
	public static boolean isPerfect(int n) {
		int sum = 0 ;
		for(int i=1 ; i<=n/2 ; i++) {
			if(n%i==0) sum+=i;		
		}
		
		return sum==n ;
	}
	
}
