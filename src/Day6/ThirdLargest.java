package Day6;

public class ThirdLargest {
	public static void main(String[] args) {
		int large = Integer.MIN_VALUE;
		int second = large ;
		int third = large ;
		int[] arr = {1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20,0,-1};
		
		for(int i : arr) {
			if(large < i) {
				third = second;
				second = large ;
				large = i ;
			}
			else if(large > i && i > second) {
				third = second;
				second = i;
			}else if(i < large && i < second && i > third) {
				third = i;
			}
		}
		
		System.out.println(third);
	}
}
