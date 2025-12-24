package Day4;

import java.util.Scanner;

public class PerfectNumberInRange {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		//sum of factor is eqals to number itself then it is a perfect number 
		int n = sc.nextInt();
		
		for(int i=1 ; i<=n ; i++) {			
			int sum = 0 ;
			for(int j=1;j<=i/2;j++) {
				if(i%j==0) sum+=j ;
			}
		System.out.printf("%d is %s \n",i,(i==sum)?"a Perfect Number":"Not a Perfect Number");
		}
	}
}
