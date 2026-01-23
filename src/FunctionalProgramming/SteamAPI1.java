package FunctionalProgramming;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class SteamAPI1 {
	public static void main(String[] args) {
		List<Integer> numbers = Arrays.asList(1,2,3,4,5,6,7,8,9,10);
		System.out.println("To print all elements one by one");
		numbers.stream().forEach(System.out::println);
		
		System.out.println("\nTo print only even numbers");
		numbers.stream().filter(a-> a%2==0).forEach(System.out::println);
		
		System.out.println("\nTo print odd numbers + 3");
		numbers.stream().filter(a -> a%2!=0).map(a-> a+=3).forEach(System.out::println);
		
		System.out.println("\nFind even numbers and store them into a list");
		List<Integer> even = numbers.stream().filter(a-> a%2==0).collect(Collectors.toList());
		System.out.println(even);
		//this list is mutable
		
		
		System.out.println("\n Printing names ending with sh");
		List<String> names = List.of("Nitish","Devansh","Girish","Mohit","Aditya","Suraj","Mridul");
		names.stream().filter(a-> a.endsWith("sh")).forEach(System.out::println);
		
		
		System.out.println("\nStudents with marks greater than 80");
		List<Student> studs = List.of(
		(new Student(3,"Devansh",90))
		,(new Student(5,"Sher",87.6))
		,(new Student(7,"Cheetah",77.8))
		,(new Student(1,"Bhalu",87.9))
		,(new Student(6,"Bhediya",80))
		,(new Student(2,"Goat",7)) );
		
		studs.stream().filter(s -> s.marks >=80).forEach(System.out::println);
	}
}
