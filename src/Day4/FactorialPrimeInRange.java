package Day4;

import java.util.Scanner;

public class FactorialPrimeInRange {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int start = sc.nextInt();
		int end = sc.nextInt();
		int prod = 1; 
		for(int i=1 ; i<=end ; i++) {
			prod *= i ;
			boolean isPrime = true ;
			for(int j=2 ; j<= i/2 ; j++) {
				if(i % j == 0) { isPrime = false; break;}
			}
			if(isPrime && i!=1) System.out.printf("%d is a prime number with factorial : %d \n" ,i , prod);
		}
	}
}
