package Day6;

public class SmallestInArray {
	public static void main(String[] args) {
		int[] arr = {1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20,0,-1};
		int smallest = Integer.MAX_VALUE;
		
		for(int i : arr) smallest = Math.min(smallest, i);
		
		System.out.println(smallest);
	}
}
