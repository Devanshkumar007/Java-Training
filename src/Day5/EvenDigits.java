package Day5;

import java.util.Scanner;

public class EvenDigits {
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the number:");
		int n = sc.nextInt();
		
		while(n>0) {
			int digit = n % 10 ;
			if( digit%2==0 ) System.out.print(digit+" ");
			n /=10;
		}
	}
}
