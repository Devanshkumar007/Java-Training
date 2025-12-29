package Day5;

import java.util.Scanner;

public class FactorialNumber {
	public static void main(String[] args) {
		int n = new Scanner(System.in).nextInt();
		
		while(n>0) {
			int digit = n %10 ;
			int prod = 1; 
			for(int i=1 ; i<=digit ; i++) prod*=i;
			System.out.printf("%d! =%d \n",digit ,prod);
			n/=10;
		}
		
	}
}
