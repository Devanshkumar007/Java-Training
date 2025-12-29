package Day7;

public class TrapingRainWater {

	public static void main(String[] args) {
		int[] height = {0,1,0,2,1,0,1,3,2,1,2,1};
		System.out.println(trap(height));
	}
	
	public static int trap(int[] height) {
		int ans = 0;
		int[] left = new int[height.length];
		int[] right = new int[height.length];
		
		int n = height.length - 1 ;
		left[0]=height[0];
		right[n]=height[n];

		for(int i=1; i<height.length ; i++) {
			left[i] = Math.max( left[i-1],height[i]);
			right[n-i] = Math.max(right[n-i+1], height[n-i]);
		}
		
		for(int i=0; i<height.length ;i++) {
			//System.out.print(left[i]+" ");
			int add = (Math.min(left[i],right[i])-height[i]);
			if(add>0) ans+=add;
		}
		return ans;
	}
	
	
	
}


//Trapping Rain Water
//Given n non-negative integers representing an elevation map where the width of each bar is 1, compute how much water it can trap after raining.
//
//Example 1
//Input:
//	height = [0,1,0,2,1,0,1,3,2,1,2,1]
//Output:
//	6
//	
//	
//Explanation:
//
//
//​
//The above elevation map (black section) is represented by array [0,1,0,2,1,0,1,3,2,1,2,1].
//In this case, 6 units of rain water (blue section) are being trapped.
//
//Example 2
//Input:
//	height = [4,2,0,3,2,5]
//Output:
//	9
//	
//	
//Constraints
//n == height.length
//1 <= n <= 2 * 10^4
//0 <= height[i] <= 10^5