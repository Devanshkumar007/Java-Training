package Day6;

public class SmartTrackerApp {
	public static void main(String[] args) {
		int[] sales = {120, 80, 150, 90, 200, 75, 110}; // Sales for 7 days (in ₹)
		int[] temp = {32, 28, 31, 29, 35, 27, 30}; // Temperatures (°C) for 7 days
		
		// 1
		System.out.printf("Average Temperatue: %.2f °C \n",averageTemperature(temp));
		extremeTemperatures(temp);
		System.out.println("Number of Hot days (>30°C): "+countDays(30 ,temp));
		overallSales(sales);
		extremeSales(sales);
		System.out.println("Number of high sales days(>100): "+countSales(100,sales));
		System.out.println("Sale 150 found on Day"+search(150,sales));
		
		update(1,95,sales);
		System.out.println("Updated sales for Day 2:" + sales[1]);
		
		
		
	}
	
	public static float averageTemperature(int[] temp) {
		float sum = 0 ;
		for(int i: temp) sum+=i;
		return (sum/temp.length);
	}
	
	public static void extremeTemperatures(int[] temp) {
		int min = Integer.MAX_VALUE;
		int max = Integer.MIN_VALUE;
		
		for(int i : temp) {
			max = Math.max(max, i);
			min = Math.min(max, i);
		}
		
		System.out.println("Hottest Day: "+max);
		System.out.println("Coldest Day: "+min);
	}
	
	public static int countDays(int limit , int[] temp) {
		int count = 0 ;
		for(int i : temp) {
			if(limit>=i) count++;
		}
		
		return count;
		
	}
	
	public static void overallSales(int[] sales) {
		float sum = 0 ;
		for(int i : sales) sum+= i;
		
		System.out.println("Total Sales : " +sum);
		System.out.printf("Average Sales : %.2f\n" , sum/sales.length );
	}
	
	
	public static void extremeSales(int[] sales) {
		int l = 0 ;
		int lowest = Integer.MAX_VALUE ;
		int h=0;
		int highest = 0 ;
		
		for(int i=0; i<sales.length ; i++) {
			if(lowest > sales[i]) {
				lowest=sales[i]; l=i;
			}
			if(highest < sales[i]) {
				highest=sales[i]; h=i;
			}
		}
		
		
		System.out.println("Highest Sale :" + highest +" on Day"+(h+1));
		System.out.println("Lowest Sale :" + lowest +" on Day"+(l+1));
	}
	
	public static int countSales(int limit, int[] temp) {
		int count = 0 ;
		
		for(int i : temp) {
			if(limit>=i) count++;
		}
		
		return count;
	}
	
	public static int search(int amount , int[] sales) {
		
		for(int i=0; i<sales.length ;i++) {
			if(amount==sales[i]) return i+1 ;
		}
		
		return -1 ;
	}
	
	public static void update(int index, int amount, int[] sales) {
		sales[index]=amount;
			
	}
	
	

	
	
}
