package Day6;

public class LargestInArray {
	public static void main(String[] args) {
		int[] arr = {1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20,0,-1};
		int largest = Integer.MIN_VALUE ;
		
		for(int i: arr) largest = Math.max(i, largest);
		
		System.out.println(largest);
		
	}
}
