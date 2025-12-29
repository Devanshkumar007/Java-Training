package Day5;

import java.util.Scanner;

public class StrongNumberInRange {
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		
		int start = sc.nextInt();
		int end = sc.nextInt();
		
		for(int i=start; i<=end ; i++) {
			//A number is strong number if sum of factorial of digit == origional number
			int temp = i ;	
			int sum = 0;
			while(temp>0) {
				int fact = 1 ;
				int digit = temp%10; 
				for(int j=1 ; j<=digit ; j++) fact *= j;
				//System.out.println(fact);
				sum+= fact ;
				temp/=10 ;
			}
			
			if(sum == i) System.out.println(sum +" is a strong number");
		}
	}
}
