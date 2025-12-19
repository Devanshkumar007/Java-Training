package Day2;

import java.util.Scanner;

public class NegPos0 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		
		if(a==0) System.out.println("0");
		else if( a>0) System.out.println("Positive");
		else System.out.println("Negative");
	}
}
