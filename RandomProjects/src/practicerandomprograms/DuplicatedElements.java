package practicerandomprograms;

import java.util.Arrays;

public class DuplicatedElements {

	public static void main(String[] args) {
		/*
		  	Question: Type the program which finds the duplicated 
		  	element of an array.Use the array [5, 0, -1, 0, 13]
		 */
		int arr[] =  {5, 0, -1, 0, 13};
		Arrays.sort(arr);
		System.out.println(Arrays.toString(arr));
		for(int i = 0; i<arr.length-1; i++ ) {
			if(arr[i]==arr[i+1]) {
				System.out.println("The repeated number is \""+ arr[i]+"\"");
			}
			
		}
		
	}
}
