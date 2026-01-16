package Day6_Arrays;

public class OddNumbers {
	public static void main(String[] args) {
		Odd(500,50);
	}
	
	public static void Odd(int i, int n) {
		if(i==n-1) return ;
		if(i%2!=0) System.out.println(i);
		Odd(i-1,n);
	}
}	
