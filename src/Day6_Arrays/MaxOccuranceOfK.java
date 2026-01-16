package Day6_Arrays;

public class MaxOccuranceOfK {
	public static void main(String[] args) {
		int[] arr = {37,823,122,2322,6017};
		int k = 2 ;
		
		int max = 0 ;
		int ans = 0 ; 
		
		for(int i =0 ; i<arr.length ; i++) {
			String curr = ""+arr[i];
			int count = 0 ;
			for(char c : curr.toCharArray()) {
				if((int)(c-'0') == k) count++; 
			}
			if(count>max) {max=count;  ans = arr[i]; }
		}
		
		System.out.println(ans);
	}
}


