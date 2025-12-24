package Day4;

import java.util.Scanner;

public class Fibonacci {
	public static void main(String[] args) {
		int a = 0 ;
		int b = 1 ;
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		for(int i=0; i<n ; i++) {
			System.out.println(a);
			int temp = b ;
			b= a+b;
			a = temp;
		}
		
		
	}
}
