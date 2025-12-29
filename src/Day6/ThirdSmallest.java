package Day6;

public class ThirdSmallest {
	public static void main(String[] args) {
		int small = Integer.MAX_VALUE;
		int second = small ;
		int third = small ;
		int[] arr = {1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20,0,-1};
		
		for(int i : arr) {
			if(small > i) {
				third = second;
				second = small ;
				small = i ;
			}
			else if(small < i && i < second) {
				third = second;
				second = i;
			}else if(i > small && i > second && i < third) {
				third = i;
			}
		}
		
		System.out.println(third);
	}
}
