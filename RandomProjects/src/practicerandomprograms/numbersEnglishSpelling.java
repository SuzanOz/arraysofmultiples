package practicerandomprograms;

import java.util.Scanner;

public class numbersEnglishSpelling {

		 static final String[] tensNames = {"", "ten"," twenty",
				" thirty"," forty"," fifty"," sixty"," seventy"," eighty",
				" ninety"};
		 static final String[] numberNames = {"", "one"," two"," three",
				" four"," five"," six"," seven"," eight"," nine",
				" ten"," eleven"," twelve"," thirteen"," fourteen"," fifteen",
				" sixteen"," seventeen"," eighteen"," nineteen"};
		
		/* create a method to convert a given numbers spelling in English
		 * 344-- 3 hundreds forty four
		 * numbers must be smaller than 1000
		 */
		public static void main(String[] args) {
			
			  
			Scanner scan = new Scanner (System.in);
			System.out.println("Please enter a number smaller than 1000:");
			int num = scan.nextInt();
			System.out.println(num + " = " + numtoEng(num));
			scan.close();
		}
		public static String numtoEng(int n) {
			String result;
			if (n==0)
				return "zero";
			if (n%100 < 20) {
				result = numberNames[n%100];
			n=n/100;
			}
			else {
				result = numberNames[n%10] ;
				n=n/10;
				result = tensNames [n%10] + result ;
				n=n/10;
			}
			
			if (n==0)
				return result.trim();
			String hundreds = numberNames[n] + " hundred" + result;
			return hundreds.trim();

		}
}



	


