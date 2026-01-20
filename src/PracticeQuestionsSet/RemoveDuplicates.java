package PracticeQuestionsSet;

import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;

public class RemoveDuplicates {
	public static void main(String[] args) {
		//Remove duplicated and keep only one occurence
		Integer[] arr = {10,20,30,40,50,10,20,40,50,100};
		HashSet<Integer> hs = new HashSet<>(Arrays.asList(arr));
		hs.forEach(a-> System.out.print(a+" "));
		System.out.println();
		
		
		//Removing all the duplicates only unique elements are present
		HashMap<Integer,Integer> mp = new HashMap<>();
		for(int i: arr) {
			mp.put(i, mp.getOrDefault(i, 0)+1);
		}
		
		for(int i: mp.keySet()) {
			if(mp.get(i)<2) System.out.print(i+" ");
		}
		
	}
}
//
//1. Remove Duplicates
//Given an array of integers, remove duplicate elements using HashSet and print unique values.