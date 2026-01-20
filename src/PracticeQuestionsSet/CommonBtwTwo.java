package PracticeQuestionsSet;

import java.util.Arrays;
import java.util.HashSet;

public class CommonBtwTwo {
	public static void main(String[] args) {
		Integer[] arr1 = {10,20,30,40,50,60};
		Integer[] arr2 = {30,40,50,60,70,80,90};
		
		HashSet<Integer> common = new HashSet<>(Arrays.asList(arr1));
		for(int i : arr2) {
			if(common.contains(i)) System.out.print(i+" ");
		}
	}
}

//3. Common Elements
//Find common elements between two integer arrays using HashSet.
//
