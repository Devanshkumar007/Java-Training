package Day5;

import java.util.Scanner;

public class NivenNumber {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		int temp = num ;
		int sum = 0 ;
		while(temp>0) {
			sum += temp%10 ;
			temp /=10;
		}
		if(num %sum == 0) System.out.println(num +" is a niven number");
		else System.out.println(num +" is not a niven number");
	}
}
