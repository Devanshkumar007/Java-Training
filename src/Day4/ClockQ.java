package Day4;

import java.util.Scanner;

public class ClockQ {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int input1 = sc.nextInt();
		int input2 = sc.nextInt();
		int result = input1 * input2;

	    
	    result = result % 12;

	    if (result == 0) {
	        result = 12;
	    }
	    
	    System.out.println(result);
	}
}
