package Day6_Arrays;

import java.util.HashMap;

public class TwoSum {
	public static void main(String[] args) {
		int[] arr = {14,6,19,1,18,2,9,11,13,8,7,3,19,11,17};
		twoSum(arr , 30);
	
		
	}
		    public static void twoSum(int[] nums, int target) {
		        HashMap <Integer,Integer> map = new HashMap<>();
		        int[] ans = new int[2];
		        for(int i=0;i<nums.length ; i++){
		            int findKey = target-nums[i];
		            if(map.containsKey(findKey)) {
		                System.out.println("Index: "+i+" "+map.get(findKey)+" Numbers: "+nums[i]+" "+findKey);
		                break;
		            }
		            map.put(nums[i],i);
		        }
		        
		    }	
	}
