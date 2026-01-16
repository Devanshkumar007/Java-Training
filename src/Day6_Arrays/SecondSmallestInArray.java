package Day6_Arrays;

public class SecondSmallestInArray {
	public static void main(String[] args) {
		int[] arr = {1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20,0,-1};
		int smallest = Integer.MAX_VALUE;
		int secondSmallest = smallest ;
		
		for(int i : arr) {
			if(smallest > i) {
				secondSmallest = smallest ;
				smallest = i ;
			}else if( smallest < i && i<secondSmallest) secondSmallest = i ;
		}
		
		
		System.out.println(secondSmallest);
	
	}

}
