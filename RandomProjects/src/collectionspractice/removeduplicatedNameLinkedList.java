package collectionspractice;

import java.util.LinkedList;
import java.util.ListIterator;
import java.util.Scanner;

public class removeduplicatedNameLinkedList {

	public static void main(String[] args) {
		/*
	 	 1)Create a LinkedList which has names in it
	 2)Ask user to enter his/her name
	 3)If the name exists in the list remove it and give a 
	 message like “Your name was in the list, it is removed”
	 4)If the name does not exist in the list, give a message 
	 like “Your name is not in the list, it is not removed” 
	 */
	LinkedList<String> nameList = new LinkedList<>();
		
	nameList.add("Joseph");
	nameList.add("Heda");
	nameList.add("Clark");
	nameList.add("Susan");
	System.out.println(nameList);
	Scanner scan = new Scanner(System.in);
	System.out.println("Please enter your name:");
	String name = scan.nextLine();
	ListIterator<String> it2 = nameList.listIterator();
	boolean existing = false;
	while(it2.hasNext()) {
		String element = it2.next(); 			
		if(element.equals(name)) {
			existing = true;
			System.out.println("Your name is existing in the list. Do you want to remove it(y/n)?");
			if(scan.next().equalsIgnoreCase("y")) {
				nameList.remove(name);
				System.out.println("Your name was removed successfully!");
				System.out.println(nameList);
			}else{System.out.println(nameList);}
		}
	}
		if(existing==false) {
				System.out.println("Sorry, your name is not existing in the list!");
		}
	scan.close();
	}

}
