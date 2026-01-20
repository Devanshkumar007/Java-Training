package Comparator_And_CustomComparable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class OrderCustomComparatorMain {
	public static void main(String[] args) {
		List<Order> orders = new ArrayList<>();

		
		orders.add(new Order(101, "Rahul", 5000.0, 3, 1700000000000L));
		orders.add(new Order(102, "Amit", 5000.0, 2, 1700000000000L));
		orders.add(new Order(103, "Amit", 5000.0, 2, 1690000000000L));
		orders.add(new Order(104, "Neha", 3000.0, 1, 1680000000000L));
		orders.add(new Order(105, "Amit", 5000.0, 2, 1690000000000L));
		orders.add(new Order(106, "Zoya", 7000.0, 5, 1710000000000L));
		orders.add(new Order(107, "Kunal", 7000.0, 3, 1705000000000L));
		orders.add(new Order(108, "Ankit", 7000.0, 3, 1705000000000L));
		orders.add(new Order(109, "Ankit", 7000.0, 3, 1705000000000L));
		orders.add(new Order(110, "Riya", 3000.0, 2, 1685000000000L));
		
		
		Collections.sort(orders, new CustomComparator());
		orders.forEach(System.out::println);

	}
	
	
}

//int orderId;
//String customerName;
//double orderAmount;
//int itemCount;
//long orderTime;
//
//Write a Java program to sort orders using Comparator based on:
//	Higher orderAmount first
//	If amount same → fewer itemCount first
//	If itemCount same → earlier orderTime first
//	If orderTime same → customerName in ascending order
//	If customerName same → orderId in ascending order