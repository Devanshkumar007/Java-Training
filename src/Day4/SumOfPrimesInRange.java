package Day4;

import java.util.Scanner;

public class SumOfPrimesInRange {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int start = sc.nextInt();
		int stop = sc.nextInt();
		int sum = 0 ;
		for(int i=start ; i<=stop ; i++) {
			boolean isPrime = true;
			for(int j=2 ; j<i ; j++) {
				if(i%j==0) { isPrime = false; break;}
			}
			if(isPrime) { sum += i; System.out.println("Prime :"+ i);}
			
		}
		
		System.out.printf("Sum of primes from %d to %d is : %d", start ,stop , sum);
	}
}
