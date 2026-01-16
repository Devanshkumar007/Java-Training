package Day6_Arrays;

public class ReverseEachElementOfArray {
	public static void main(String[] args) {
		int[] arr = {123,456,789,101112,131415};
		
		for(int i : arr) {
			int rev = 0 ;
			while(i>0) {
				rev = rev*10 + i%10 ;
				i/=10;
			}
			System.out.print(rev+" ");
		}
	}
}
