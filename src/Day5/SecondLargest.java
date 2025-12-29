package Day5;

import java.util.Scanner;

public class SecondLargest {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int largest = Integer.MIN_VALUE;
		int sec = largest ;
		int n = sc.nextInt();
		while(n>0) {
			int digit = n % 10 ;
			if(largest < digit) {sec = largest ; largest = digit ;}
			else if(largest > digit && digit > sec) {sec = digit;}
			n /=10 ;
		}
		
		System.out.println("Largest : "+largest+" Second Largest: "+sec);
	}
}
