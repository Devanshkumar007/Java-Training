package Day7;

import java.util.HashMap;

public class WordCount {
	public static void main(String[] args) {
		String s = "java is a programming language it is a high level programming language" ;
		System.out.println(solution(s));
		
	}
	
	public static HashMap<String,Integer> solution(String str){
		HashMap<String,Integer> mp = new HashMap<>();
		String[] arr = str.split(" ");
		for(int i=0;i<arr.length ;i++) {
			mp.put(arr[i], mp.getOrDefault(arr[i], 0)+1);
		}
		return mp;
	}
}



//String s = "java is a programming language it is a high level programming language" ;
//
//java = 1
//is = 2
//a = 2
//programming = 2
//language = 2
//it = 1
//high = 1
//level = 1 


