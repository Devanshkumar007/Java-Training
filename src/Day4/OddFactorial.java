package Day4;

import java.util.Scanner;

public class OddFactorial {
	public static void main(String[] args) {
		int prod = 1 ;
//		int n = new Scanner(System.in).nextInt();
		int[] arr = new int[11];
		for(int i=1 ; i<11 ;i++) {
			prod *=i ;
			arr[i] = prod;
		}
		for(int i=10 ; i>0 ; i--) if(i%2!=0) System.out.println(arr[i]);
	}
}


