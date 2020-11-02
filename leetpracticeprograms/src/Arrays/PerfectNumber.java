package Arrays;

import java.util.Scanner;

public class PerfectNumber {

	public static void main(String[] args) {
		/*
		   Perfect number, a positive integer that is equal to the sum of its proper divisors.
		   The smallest perfect number is 6, which is the sum of 1, 2 and 3.
		 */
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a number to see if it is a perfect number:");
		int n = scan.nextInt();
		int t=0;
		for(int i=1; i<n; i++) {
			if (n%i==0) {
				t+=i;
			}
		}
		if(n==t) {
			System.out.println("It is a perfect number!");
		}else {
			System.out.println("It is not a perfect number!");
		}
		scan.close();
	}

}
