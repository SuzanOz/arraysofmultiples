package practicerandomprograms;

import java.util.Scanner;

public class BasicCalculator {
	static double a=0;
	static double b=0;
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the first number:");
		a=scan.nextDouble();
		System.out.println("Enter the second number:");
		b=scan.nextDouble();
		System.out.println("which operation would you like to do?(/, *, +, -)");
		String operation=scan.next();
		if (operation.equals("+")){
			System.out.println(add(a, b));
		}else if(operation.equals("-")){
			System.out.println(sub(a, b));
		}else if(operation.equals("*")){
			System.out.println(multiple(a, b));
		}else if(operation.equals("/")) {
			System.out.println(divide(a,b));
		}else {
			System.out.println("Enter a valid operation sign!");
		}
		scan.close();
	}
	public static double add(double a2, double b2) {
		return a2+b2;	
	}
	public static double sub(double a, double b) {
		return a-b;	
	}
	public static double multiple(double a, double b) {
		return a*b;	
	}
	public static double divide(double a, double b) {
		return a/b;	
	}
	
}