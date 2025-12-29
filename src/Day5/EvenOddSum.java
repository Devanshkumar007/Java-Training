package Day5;

import java.util.Scanner;

public class EvenOddSum {
	public static void main(String[] args) {
		int evenSum =0 ;
		int oddSum = 0 ;
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		while(n>0) {
			int digit = n %10 ;
			if(digit %2==0) evenSum+=digit;
			else oddSum += digit ;
			n /=10 ;
		}
		System.out.printf(" Even Sum : %d \n Odd Sum: %d \n Product : %d",evenSum ,oddSum , oddSum*evenSum);
	}
}
