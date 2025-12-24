package Day4;

import java.util.Scanner;

public class PrimesInRange {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int count = 0 ;
		for(int i=2 ; i<=n ; i++) {
			boolean isPrime = true;
			for(int j=2 ; j<i ; j++) {
				if(i%j==0) { isPrime = false; break;}
			}
			if(isPrime) { count++; System.out.println("Prime :"+i);}
			
		}
		
		System.out.printf("Total primes in range 1 to %d is %d",n,count);
		
	}
}
