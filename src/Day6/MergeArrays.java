package Day6;

public class MergeArrays {
	public static void main(String[] args) {
		int[] arr = {1,2,3,4,5,6,7,8,9,10,11,12}; int[] arr2 ={13,14,15,16,17,18,19,20,0,-1};
		int mergedArr[] = new int[arr.length+ arr2.length];
		int i=0 ;
		for(int j : arr) mergedArr[i++]=j;
		for(int j : arr2) mergedArr[i++]=j;
		
		for(int j : mergedArr) System.out.print(j+" ");
	}
}

