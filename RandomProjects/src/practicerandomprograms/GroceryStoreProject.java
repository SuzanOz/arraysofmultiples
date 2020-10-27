package practicerandomprograms;

import java.util.ArrayList;
import java.util.Scanner;

public class GroceryStoreProject {

	static ArrayList <String> productList = new ArrayList<>();
	static  ArrayList<Double> productPrices = new ArrayList<>();
	static double totalAmount;
	
	public static void main(String[] args) {
		productList.add("Tomato--ID=0");
		productList.add("Cucumber--ID=1");
		productList.add("Pepper--ID=2");
		productList.add("Orange--ID=3");
		productList.add("Apple--ID=4");
		
		productPrices.add(5.0);
		productPrices.add(3.0);
		productPrices.add(2.0);
		productPrices.add(3.5);
		productPrices.add(1.8);
		
		System.out.println("Product List:\n" + productList.toString());
		System.out.println("Product Prices:\n" + productPrices.toString());
		customerChoice();
	}
	
	public static void customerChoice() {
		Scanner scan = new Scanner(System.in);
		System.out.println("What would you like to buy today?:");
		int choice = scan.nextInt();
		if (choice>4 || choice<0) {
			System.out.println("You need to enter a number between 0 and 4.");
		}else {
			System.out.println("How many pounds would you like to get?:");
			double weight = scan.nextDouble();
			double productPrice = productPrices.get(choice);
			double totalProductPrice= productPrice*weight;
			totalAmount += totalProductPrice;
			System.out.println("Your product is " + productList.get(choice));
			System.out.println("Your price is " + productPrice);
			System.out.println("To keep shopping enter 1 \nTo go to payment enter 2");
			int decision = scan.nextInt();
			if (decision==1) {
				customerChoice();
			}else {
				cash();
			}
			
		}
		scan.close();
	}
	
	public static void cash() {
		System.out.println("Total Amount = " + totalAmount);
		
	}

}
