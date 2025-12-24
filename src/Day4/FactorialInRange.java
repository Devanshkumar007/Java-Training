package Day4;

import java.util.Scanner;

public class FactorialInRange {
	public static void main(String[] args) {
		int prod = 1 ;
		int n = new Scanner(System.in).nextInt();
		for(int i=1 ;i<=n ; i++) {
			prod*=i;
			System.out.println("factorial of "+i+" is: "+prod);
		}
	}
}
