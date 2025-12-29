package Day5;

import java.util.Scanner;

public class DisariumNumber {
	
	//sum of digit raised to the power of their respective position == number itself  
	public static void main(String[] args) {
		String n = new Scanner(System.in).nextLine();
		int pow = n.length();
		int num = Integer.parseInt(n);
		int sum = 0 ;
		while(num > 0) {
			double digit = Math.pow(num%10, pow--);
			sum += (int)(digit);
			num/=10;
		}
		System.out.println(sum+" "+n);
		
	}
}


