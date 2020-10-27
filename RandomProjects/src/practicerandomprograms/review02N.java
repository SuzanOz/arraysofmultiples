package practicerandomprograms;

import java.util.Scanner;

public class review02N {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		//System.out.println("Enter your yearly income:");
		//int salary = scan.nextInt();
		
//		if(salary<50000) {
//			System.out.println("You are not eligible to buy a home!");
//		}else if(salary>=50000 && salary<=90000)
//		{
//			System.out.println("You are eligible to buy a home costs less than $300K");
//		}else {
//			System.out.println("You are good to purchase any type of home!");
//		}
		/*
		 * Question 2: Type the program which asks 
		 * the user the favorite color. If it is 
		 * green, it prints you like natural places. 
		 * If it is yellow, it prints you like 
		 * brightness. If it is red, it prints you 
		 * like mystery. If it is blue, it prints 
		 * you like comfort. If it is none of them, 
		 * it prints I can not see your feeling with 
		 * that color.
		 */
		System.out.println("Enter your favorite color:");
		String color = scan.next();
		color = color.toLowerCase();
		if (color.contains("green")) {
			System.out.println("you like natural places");
		}else if(color.contains("yellow")) {
			System.out.println("you like brightness");
		}else if(color.contains("red")) {
			System.out.println("you like mystery");
		}else if(color.contains("blue")) {
			System.out.println("you like comfort");
		}else {
			System.out.println("I can not see your feeling withthat color.");
		}
		short y = 7/2;
		System.out.println(y);
		scan.close();
	}

}
