package Day2;

import java.util.Scanner;

public class Div7 {
	public static void main(String[] args) {
		//jp to check given number is divisible by 7 or not 
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		System.out.println( a%7 == 0 ?"Divisible by 7" : "Not divisible by 7");
		
	}
}
