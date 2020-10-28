package practicerandomprograms;
import java.util.*;
public class ArrayOfMultiples {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Which number's multiples would you like to find?");
		int first = scan.nextInt();
		System.out.println("How many times would you like to get multiples of " + first );
		int second = scan.nextInt();
		System.out.println(Arrays.toString(arrayOfMultiples(first, second)));
		scan.close();
	}
	public static int[] arrayOfMultiples(int num, int length) {
		int arr[] = new int[length];
		int k=1;
		for(int i = 0; i<length; i++) {
			arr[i] = num * k;
			k++;
		}
		return arr;
		
	}
}
