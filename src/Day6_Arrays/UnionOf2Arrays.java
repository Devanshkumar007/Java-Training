package Day6_Arrays;

public class UnionOf2Arrays {	
	public static void main(String[] args) {
		int[] arr = {1,1,2,4,5,6,7,8,7,2};
		int[] arr2 = {9,10,7,2,6,14};
		int size = 0 ;
		
		
		for(int i=0; i<arr.length ; i++) {
			boolean flag = true ;
			for(int j= i ; j<arr.length ; j++) {
				if( i!=j && arr[i]==arr[j] ) flag = false;
			}
			if(flag) size++;
		}
		
		
		for(int i=0; i<arr2.length ; i++) {
			boolean flag = true ;
			for(int j= i ; j<arr2.length ; j++) {
				if( i!=j && arr2[i]==arr2[j] ) flag = false;
			}
			if(flag) size++;
		}
		
		//System.out.println(size);
		
		int index = 0 ;
		int[] ans = new int[size];
		
		for(int i=0; i<arr.length ; i++) {
			boolean flag = true ;
			for(int j= i ; j<arr.length ; j++) {
				if( i!=j && arr[i]==arr[j] ) flag = false;
			}
			if(flag) ans[index++]=arr[i];
		}
		
		for(int i=0; i<arr2.length ; i++) {
			boolean flag = true ;
			for(int j= i ; j<arr2.length ; j++) {
				if( i!=j && arr2[i]==arr2[j] ) flag = false;
			}
			if(flag) ans[index++]=arr2[i];
		}
		
		
		int unique = 0 ;
		
		for(int i=0; i<ans.length ; i++) {
			boolean flag = true ;
			for(int j= i ; j<ans.length ; j++) {
				if( i!=j && ans[i]==ans[j] ) flag = false;
			}
			if(flag) ans[unique++]=ans[i];
		}
		
		
		for(int i=0; i<unique ; i++) {
			System.out.print(ans[i]+" ");
		}
		
		
		
		
		
		
		
		
		
	}
}


//96. WAJP to find union from two array without Collection.
//97. WAJP to find intersection from two array without Collection.
//98. WAJP to print occurrence of each element without using Map.
//99. WAJP to find unique elements from array without using Collection and Map.
//100. WAJP to find duplicates(Which occurs more than 1) from array without using Collection
//and Map.
