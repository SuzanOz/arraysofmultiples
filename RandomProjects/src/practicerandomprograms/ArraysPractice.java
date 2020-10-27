package practicerandomprograms;

import java.util.Arrays;
import java.util.Scanner;

public class ArraysPractice {

	public static void main(String[] args) {
		//*********-1-**********
		System.out.println("*****1st*****");
		String arr1[] = {"1", "2", "3", "1"};
		String arr2[] = {"1", "2"};
		
		System.out.println("Two arrays are equals?: " + Arrays.equals(arr1, arr2));
		System.out.println("Index number of searched element: " + Arrays.binarySearch(arr1, "1"));
		String str = "Computer Science!";
		String arr3 [] = str.split("u");
		
		System.out.println("Splitted array: " + Arrays.toString(arr3));
		
		//*********2-Greatest & smallest array element**********
		System.out.println("*****2nd*****");
		int numArr[] = {7, 1, 8, 32, -5, 5, 11};
		int a = numArr[0];
		int b = numArr[0];
		for(int i = 0; i<numArr.length; i++) {
			if(a<numArr[i]) {
				a = numArr[i];
			}
			if(b>numArr[i]) {
				b = numArr[i];
			}
		}System.out.println("Greatest array element = " + a);
		System.out.println("Smallest array element = " + b);
		
		//*********3-Make a new array with the user entered string**********
		System.out.println("*****3rd*****");
		Scanner scan  = new Scanner(System.in);
		System.out.println("Enter the number of the words, please:");
		String strArr[] = new String[scan.nextInt()];
		System.out.println("Enter the word, please:");
		
		for(int i=0; i<strArr.length; i++) {
			strArr[i] = scan.next();
			
		}
		System.out.println(Arrays.toString(strArr));
		scan.close();
		//*********4-Copying an existing array to a new one**********
		System.out.println("*****4th*****");
		String arr[] = {"John", "Susanne", "Seth"};
		String newarr[] = new String[arr.length];
		int z=0;
		for(int i=arr.length-1; i>=0; i--) {
			newarr[z] = arr[i]; 
			z++;
		}System.out.println(Arrays.toString(newarr));
		
		
		//*********Total of 2 dimensional array elements**********
		System.out.println("*****5th*****");
		int total=0;
		int arr4 [][] = {{3,1,2},{6,-2}};
		for(int i = 0; i<arr4.length; i++) {
			for(int j = 0; j<arr4[i].length; j++) {
				total += arr4[i][j];
			}
		}System.out.println("Total of elements = " + total);
		
	}

}
