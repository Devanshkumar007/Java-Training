package Day4;

import java.util.Scanner;

public class PerfectNumber {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		//sum of factor is eqals to number itself then it is a perfect number 
		int sum = 0 ;
		int n = sc.nextInt();
		for(int i=1;i<n;i++) {
			if(n%i==0) sum+=i ;
		}
		System.out.printf("%d is a %s ",n,(n==sum)?"Perfect Number":"Not perfect number");
	}
}
