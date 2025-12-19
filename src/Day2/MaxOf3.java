package Day2;

import java.util.Scanner;

public class MaxOf3 {
public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int num1 = sc.nextInt();
		int num2 = sc.nextInt();
		int num3 = sc.nextInt();
		
		if(num1 > num2 && num1 > num3) System.out.printf("Largest between %d, %d, %d is : %d",num1, num2, num3, num1);
		if(num2 > num1 && num2 > num3) System.out.printf("Largest between %d, %d, %d is : %d",num1, num2, num3, num2);
		else System.out.printf("Largest between %d, %d, %d is : %d",num1, num2, num3, num3);
	}
}
