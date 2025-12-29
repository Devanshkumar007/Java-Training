package Day5;

public class SpecialNumberInRange {
	public static void main(String[] args) {
		
		for(int i=0; i< 101 ; i++) {
			int sum = 0 ;
			int prod = 1 ;
			int temp = i ;
			while(temp > 0) {
				int d = temp %10 ;
				sum+= d;
				prod*=d;
				temp/=10;
			}
			if(sum+prod == i) System.out.println(i+ " is a Special Number");
			//else System.out.println(i+ " is not a Special Number");
		}
	}
}
