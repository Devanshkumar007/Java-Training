package Day5;

import java.util.Scanner;

public class StrongNumber {
	public static void main(String[] args) {
		//A number is strong number if sum of factorial of digit == origional number 
		int n = new Scanner(System.in).nextInt();
		int temp = n ;	
		int sum = 0;
		while(n>0) {
			int fact = 1 ;
			int digit = n%10; 
			for(int i=1 ; i<=digit ; i++) fact *= i;
			System.out.println(fact);
			sum+= fact ;
			
			n/=10 ;
		}
		
		if(sum == temp) System.out.printf("%d is a Strong number ",temp);
		else System.out.printf("%d is not a Strong number ",temp);
				
	}
}
