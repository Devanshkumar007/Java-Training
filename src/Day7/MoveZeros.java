package Day7;

//Given an integer array nums, move all 0’s to the end of it while maintaining the relative order of the non-zero elements.
//
//Note: You must do this in-place without making a copy of the array.
//
//Example 1 :
//Input:
//	nums = [0,1,0,3,12]
//Output:
//	[1,3,12,0,0]
//	
//Example 2 :
//Input:
//	nums = [0]
//Output:
//	[0]
//	
//	
//Constraints :
//1 <= nums.length <= 10^4
//-2^31 <= nums[i] <= 2^31 - 1





public class MoveZeros {
	public static void main(String[] args) {
		int[] nums = {0,1,0,3,12};
		solution(nums);
		for(int i : nums) System.out.print(i+" ");
	}
	
	public static int[] solution(int[] nums) {
		int index = 0; 
		for(int i=0;i<nums.length ;i++) {
			if(nums[i]==0) continue;
			nums[index++]=nums[i];
		}
		for( ; index<nums.length ; index++) nums[index]=0;
		return nums;
	}
}
