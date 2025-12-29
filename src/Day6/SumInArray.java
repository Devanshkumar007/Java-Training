package Day6;

public class SumInArray {
	public static void main(String[] args) {
		int[] arr = {1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20};
		int sum  = 0 ;
		
		for(int i : arr) sum+=i;
		System.out.println(sum);
	}
}
