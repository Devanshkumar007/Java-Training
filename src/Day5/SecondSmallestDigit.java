package Day5;

import java.util.Scanner;

public class SecondSmallestDigit {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int smallest = Integer.MAX_VALUE;
		int sec = smallest ;
		int n = sc.nextInt();
		while(n>0) {
			int digit = n % 10 ;
			if(smallest > digit) {sec = smallest ; smallest = digit ;}
			else if( smallest < digit && digit < sec) {sec = digit;}
			n /=10 ;
		}
		
		System.out.println(" Smallest : "+smallest+"\n Second Smallest: "+sec);
	}
}
