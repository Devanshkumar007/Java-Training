package Day5;

import java.util.Scanner;

public class LargestDigit {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int largest = Integer.MIN_VALUE;
		int n = sc.nextInt();
		while(n>0) {
			largest = Math.max(n %10, largest);
			n /=10 ;
		}
		
		System.out.println("Largest : "+largest);
	}
}
