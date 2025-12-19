package Day2;

import java.util.Scanner;

public class Div3Or5 {
public static void main(String[] args) {

	//jp to check whether the given number is divisible by both 3 and 5 or not
	Scanner sc = new Scanner(System.in) ;
	System.out.print("Enter: ");
	int a = sc.nextInt();
	if( a%3==0 && a%5==0 ) System.out.println(a + " Divisble by both 3 & 5");
	else System.out.println("NOT DIVISIBLE");
	}
}
