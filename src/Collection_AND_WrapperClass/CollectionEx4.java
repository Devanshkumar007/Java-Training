package Collection_AND_WrapperClass;

import java.util.ArrayList;
import java.util.Collections;

public class CollectionEx4 {
	public static void main(String[] args) {
		ArrayList<String> cities = new ArrayList<>();
		cities.add("Delhi");
		cities.add("Mumbai");
		cities.add("Chennai");
		cities.add("Kolkata");
		cities.add(2,"Banglore");
		cities.forEach(a-> System.out.print(a+" "));
		System.out.println();
		System.out.println();
		
		
		System.out.println(cities.contains("Mumbai")?"Mumbai is present": "Mumbai is not present");
		System.out.println();

		
		Collections.sort(cities);
		cities.forEach(a-> System.out.print(a+" "));
		System.out.println();
		
		Collections.reverse(cities);
		cities.forEach(a-> System.out.print(a+" "));
		System.out.println();
		

		System.out.println();
		cities.clear();
		System.out.println(cities.size());
		
	}
}

//Write a Java program that performs the following operations on an ArrayList of Strings:
//- Create an ArrayList named cities.
//- Add the following city names to the list: "Delhi", "Mumbai", "Chennai", "Kolkata".
//- Insert the city "Bangalore" at index 2.
//- Display all the cities in the list.
//- Check whether the city "Mumbai" exists in the list and print a message:
//	If found, print: "Mumbai is present in the list."
//	Otherwise, print: "Mumbai is not present in the list."
//- Sort the list of cities in alphabetical order and display the sorted list.
//- Clear the list and print the final size of the ArrayList.