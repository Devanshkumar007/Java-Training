package Day5;

import java.util.Scanner;

public class AbundantNumber {
	public static void main(String[] args) {
		int num = new Scanner(System.in).nextInt();
		int sum = 0 ;
		for(int i=1; i<=num/2 ; i++) {
			if(num % i == 0) sum+= i;
		}
		if(sum > num) System.out.println(num+" Abundant Number");
		else System.out.println(num+ " Not a Abundant Number");
	}
}
