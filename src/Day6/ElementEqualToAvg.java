package Day6;

public class ElementEqualToAvg {
	public static void main(String[] args) {
		int[] arr = {1,3,2,4,5};
		int avg = 0 ;
		for(int i : arr) avg+=i;
		
		avg /= arr.length ;
		int count = 0;
		for(int i : arr) {
			if(avg==i) count++;
		}
		
		System.out.println(count);
	}
}
