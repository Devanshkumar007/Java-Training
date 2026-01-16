package Day6_Arrays;

public class RangeSum {
	public static void main(String[] args) {
		sum(1,5);
		System.out.println(tryingSum(5));
		System.out.println(total);
		
//		byte i = 2 ;
//		byte j = 10 ;
//		System.out.println(i*j);
	
	}
	
	static int total = 0 ;
	public static void sum (int start , int end) {
		if(start==end+1) return ;
		total+=start;
		sum(++start,end);
		
	}
	
	public static int tryingSum(int j) {
		if(j==0) return 0 ;
		return j + tryingSum(j-1) ;
	}
	
}

