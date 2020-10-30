package practicerandomprograms;

import java.util.Scanner;

public class RegexSubStringExample {

	public static void main(String[] args) {
		/*
		  Type the codes which asks the user to enter the name. 
		  It prints the first three characters of the name and puts * 
		  for the rest of the characters.
		*/
			Scanner scan = new Scanner(System.in);
			System.out.println("Enter your full name, please:");
			String name = scan.nextLine().trim();
			String first = name.substring(0,3);
			String last = name.substring(3,name.length());
			//System.out.println(last);
			String rep = last.replaceAll("\\D", "*");
			System.out.println(first + rep);
			scan.close();
	}

}
