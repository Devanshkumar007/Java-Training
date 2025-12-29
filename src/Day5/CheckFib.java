package Day5;

public class CheckFib {
	public static void main(String[] args) {
		System.out.println(check(4));
	}
	
	public static boolean check(int n) {
		int a = 0 ;
		int b = 1 ;
		while(b <= n) {
			if(a==n || b==n) return true ;
			//System.out.println(a);
			int temp = a ;
			a = b ;
			b += temp;
		}
		return false ;
	}
}
