package Arrays;

import java.util.HashSet;


public class ArrayDoubleExistWithHashMap {
	public static void main(String[] args) {
		int arr[] = {-2,0,10,-19,4,6,-8};
		HashSet<Integer> hs = new HashSet<>();
	    for(int e : arr){
	        if(hs.contains(e * 2) || (e % 2 == 0 && hs.contains(e / 2))) 
	        System.out.println(true);
	        hs.add(e);
	    }
	    System.out.println(false);
	}
}
