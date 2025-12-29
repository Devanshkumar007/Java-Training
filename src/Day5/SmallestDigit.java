package Day5;

import java.util.Scanner;

public class SmallestDigit {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int smallest = Integer.MAX_VALUE;
		int n = sc.nextInt();
		while(n>0) {
			smallest = Math.min(n %10, smallest);
			n /=10 ;
		}
		
		System.out.println("Smallest : "+smallest);
	}
}
