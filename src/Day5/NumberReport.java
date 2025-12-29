package Day5;

public class NumberReport {
	public static void main(String[] args) {
		System.out.println(reverseNumber(12345));
		System.out.println(isPalindrome(12321));
		System.out.println(isStrongNumber(145
				));
		System.out.println(countPrimes(1235784));
		
		
		
	}
	
	public static int reverseNumber(int n) {
		StringBuilder sb = new StringBuilder(n+"");
		sb.reverse();
		return Integer.parseInt(sb.toString());
	}
	
	public static boolean isPalindrome(int n) {
		int org = n ;
		int rev = 0 ;
		while(n>0) {
			rev = rev*10 + n%10;
			n/=10;
		}
		return org==rev;
	}
	public static boolean isStrongNumber(int n) {
		int temp = n ;	
		int sum = 0;
		while(n>0) {
			int fact = 1 ;
			int digit = n%10; 
			for(int i=1 ; i<=digit ; i++) fact *= i;
			sum+= fact ;
			
			n/=10 ;
		}
		
		return sum == temp ;
	}
	
	public static int countPrimes(int n) {
		
		int count = 0 ;
		while(n>0) {
			int digit = n%10;
			if(isPrime(digit)) count++;
			n /=10 ;
		}
		return count ;
	}
	
	public static boolean isPrime(int n) {
		if(n==1 || n==0) return false ;
		for(int i=2 ; i<=n/2 ; i++) {
			if(n%i == 0) return false ;
		}
		return true;
	}
}
