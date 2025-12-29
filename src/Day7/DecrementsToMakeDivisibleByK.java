package Day7;

public class DecrementsToMakeDivisibleByK {
	public static void main(String[] args) {
		int[] nums= {5,9,12,16,25};
		System.out.println(solution(nums,6));
	}
	
	public static int solution(int[] nums , int k) {
		int ans =0 ;
		for(int i: nums) {
			ans += (i%k) ; 
		}
		return ans;
	}
	
}
