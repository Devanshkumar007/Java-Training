package Day5;

import java.util.Scanner;

public class PrimeDigit {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		while(n>0) {
			int digit = n%10;
			if(isPrime(digit)) System.out.print(digit+" ");
			n /=10 ;
		}
	}
	
	public static boolean isPrime(int n) {
		if(n==1 || n==0) return false ;
		for(int i=2 ; i<=n/2 ; i++) {
			if(n%i == 0) return false ;
		}
		return true;
	}
}
