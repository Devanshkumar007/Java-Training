package Day4;

import java.util.Scanner;

public class PrimeNumber {
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		int n = sc.nextInt();
		
		for(int i=2 ; i<n ; i++) {
			if(n%i  == 0) {
				System.out.printf("%d is not a prime",n);
				return ;
			}
		}
		System.out.printf("%d is a prime",n);
		
	}
}

//jp to print prime numbers from 1 to n  