package Regex;

public class Regex4 {
	public static void main(String[] args) {
		System.out.println("colr".matches("colo?r")); 	//true
		System.out.println("color".matches("colo?r")); 	//true
		System.out.println("coloor".matches("colo?r")); //false
		System.out.println("abc".matches("abc?")); 		//true
		System.out.println("ab".matches("abc?")); 		//true
		System.out.println("abcc".matches("abc?")); 	//false
		System.out.println("abcc".matches("a(bc)?")); 	//false
		System.out.println("abcbc".matches("a(bc)?"));	//false
		System.out.println("a".matches("a(bc)?"));		//true
		System.out.println("abc".matches("a(bc)?"));	//true
		
		//colo?r means col accompanied by o atmost 1 time and then ended with r 
		// color colr only possible ans
		
		//abc? -> ab abc 
		
		//a(bc)? means a accompanied by bc atmost 1 time 
		// a , abc only possible 
		
//		(Dev)*
//		D*e*V*
	}
}
