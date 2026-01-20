package Comparator_And_CustomComparable;

import java.util.Comparator;


public class CustomComparator implements Comparator<Order>{

	@Override
	public int compare(Order o1, Order o2) {
		// TODO Auto-generated method stub
		if(Double.compare(o1.orderAmount, o2.orderAmount) != 0) {
			return Double.compare(o1.orderAmount, o2.orderAmount);
		}
		
		if(o1.itemCount - o2.itemCount != 0) {
			return o1.itemCount - o2.itemCount ;
		}
		
		if(Long.compare(o1.orderTime, o2.orderTime) != 0) {
			return Long.compare(o1.orderTime, o2.orderTime);
		}
		
		if(o1.customerName.compareToIgnoreCase(o2.customerName) != 0) {
			return o1.customerName.compareToIgnoreCase(o2.customerName);
		}
		
		
		return o1.orderId - o2.orderId;
	}

}
//}
//Write a Java program to sort orders using Comparator based on:
//	Higher orderAmount first
//	If amount same → fewer itemCount first
//	If itemCount same → earlier orderTime first
//	If orderTime same → customerName in ascending order
//	If customerName same → orderId in ascending order