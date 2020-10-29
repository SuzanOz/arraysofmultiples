package practicerandomprograms;

import java.util.Scanner;

public class missingString {
	// write a program to find the missing 
	//char in a serial string.

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a string: ");
		String str = scan.nextLine();
		System.out.println(missingLetter(str));
		scan.close();
	}
	
	public static String missingLetter(String str) {
	
		for (int i = 0; i < str.length()-1; i++) {
			if(str.charAt(i+1)-str.charAt(i)!=1) {
				return(char)(str.charAt(i)+1)+" ";
			}
			}return "Not missing any character.";
		}		
	}

