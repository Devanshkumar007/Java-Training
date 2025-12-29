package Day5;

import java.util.Scanner;

public class SpecialNumber {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int temp = n ;
		int sum = 0;
		int prod = 1 ;
		
		while(n>0) {
			int digit = n %10 ;
			sum+=digit;
			prod*=digit;
			n/=10;
		}
		
		int total = sum + prod ;
		if(total == temp) System.out.println("Special Number :"+total);
		else System.out.println("Not a Special Number");
		
	
	
	}
}
