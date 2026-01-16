package Day6_Arrays;

public class AverageOfLArgestSmallest {
	public static void main(String[] args) {
		double max = Integer.MIN_VALUE;
		double min = Integer.MAX_VALUE;
		
		int[] arr = {1,4,4,2};
		
		for(int i : arr) {
			max=Math.max(max,i);
			min=Math.min(min,i);
		}
		
		double sum = 0; 
		double count=0;
		for(int i : arr) {
			if(max==i) { sum+=max; count++;}
			else if(min==i) {sum+=min; count++;}
		}
		
		System.out.println((sum)/count);
	}
}


