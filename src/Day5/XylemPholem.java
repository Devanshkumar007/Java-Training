package Day5;

import java.util.Scanner;

public class XylemPholem {
	public static void main(String[] args) {
		int n = new Scanner(System.in).nextInt();
		int last = 0 ;
		int org = n ;
		int extreme = n%10 ;
		int inner = 0 ;
		while(n>0) {
			last = n %10 ;
			inner += last;
			n/=10;
		}
		inner = inner -last -extreme ;
		extreme += last ;
		if(extreme == inner )System.out.println(org + " is a Xylen");
		else System.out.println(org +" is a Pholem");
	}
}
