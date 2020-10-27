package practicerandomprograms;

import java.util.Scanner;

public class Ternary01 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
//		System.out.println("Enter your birth year:");
//		int age = 2020 - (scan.nextInt());
//		System.out.println(age);
//		String result = (age>=65) ? ("You are eligible to retired!") : ("You are not eligible to retired!");
//		System.out.println(result);
//		System.out.println("Enter a number:");
//		int num = scan.nextInt();
//		int result = (num>9 && num<100) ? (num%10) : (num*num);
//		System.out.println(result);
		System.out.println("Enter t,g, or v for your size of the coffee, please:");
		char size = (scan.next()).toLowerCase().charAt(0);
//		String result = (size=='g')?  ("Grande") : (size=='v')?  ("Venti") : ("Tall");
//		System.out.println(result);
		switch(size) {
			case('t'):{
				System.out.println("Tall");
				break;
			}
			case('g'):{
				System.out.println("Grande");
				break;
			}
			case('v'):{
				System.out.println("Venti");
				break;
			}
			default:{
				System.out.println("You can enter only t, v, or g");
			}
		
		scan.close();
	}

}
}
