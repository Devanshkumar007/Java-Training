package Day7;


//
//Given an integer array nums, return an array answer such that answer[i] is equal to the product of all the elements of nums except nums[i].
//
//The product of any prefix or suffix of nums is guaranteed to fit in a 32-bit integer.
//
//You must write an algorithm that runs in O(n) time and without using the division operation.
//
//Example 1 :
//Input:
//	nums = [1,2,3,4]
//Output:
//	[24,12,8,6]
//	
//Example 2 :
//Input:
//	nums = [-1,1,0,-3,3]
//Output:
//	[0,0,9,0,0]
//	
//	
//Constraints
//2 <= nums.length <= 10^5
//-30 <= nums[i] <= 30
//The product of any prefix or suffix of nums is guaranteed to fit in a 32-bit integer.
//


public class ProductOfArrayExceptSelf {
	public static void main(String[] args) {
		int[] nums = {1,2,3,3,4};
		nums = solution(nums);
		for(int i : nums) System.out.print(i+" ");
	}
	
	public static int[] solution(int[] nums) {
		int zeroCount = 0 ;
		int prod = 1 ;
		
		for(int i : nums) {
			if(i==0) zeroCount++;
			else prod*=i;
		}
		if(zeroCount >=2) return new int[nums.length];
		
		for(int i=0;i<nums.length ;i++) {
			if(zeroCount>0 && nums[i]!=0) nums[i] = 0;
			else if(nums[i]==0) nums[i] = prod ;
			else nums[i] = prod/nums[i];
		}
		
		return nums ;
	}
}

