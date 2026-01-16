package Day6_Arrays;

public class CountDivisor {
	public static void main(String[] args) {
		int[] a = {9,-13,8,-7,-8,18,10};
		int count = 0 ;
		int k = 18;
		for(int i : a) {
			if(k%i == 0) count++;
		}
		
		System.out.println(count);
		
	}
}	
