package UserDBHashMap;

import java.io.File;
import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.util.HashMap;
import java.util.Scanner;

public class AddUser {
	static Scanner scan = new Scanner(System.in);
	/*
	  Create saveInfo() Method
	  1) Get SSN(9 digits), full name, address, phone number from multiple user.
	  2) Put data into a map like; SSN will be key, all the other informations will be values.
	  3) If user tries to use repeated SSN, give an error message and ask user to enter a new ssn
	  4) Tell user to stop entrance by pressing "Q".
	 */
	
	public static void addUser(HashMap<String, String> user) {
	
		String ssn = "";
		do {
			System.out.println("Enter SSN:");
			ssn = scan.next();
			while(user.keySet().contains(ssn)) {
	            System.out.println(ssn+ " exists. Enter a non-existing ssn");
	            ssn= scan.next();
	            }
			scan.nextLine();
			System.out.println("Enter your full name:");
			String name = scan.nextLine();
			System.out.println("Enter your address:");
			String address = scan.nextLine();
			System.out.println("Enter phone number");
			String phone = scan.nextLine();
			String userInput ="\nName: "+ name +"\nAddress: "+ address +"\nPhone: "+  phone; 
			user.put(ssn, userInput);
			System.out.println("Press \'y' to enter more \nPress \'q' to exit ");
		}while(!scan.next().equalsIgnoreCase("Q"));
		System.out.println(user);
		//write to file : "Users"
	    try {
	        File fileOne=new File("src/UserDBHashMap/Users");
	        FileOutputStream fos=new FileOutputStream(fileOne);
	        ObjectOutputStream oos=new ObjectOutputStream(fos);

	        oos.writeObject(user);
	        oos.flush();
	        oos.close();
	        fos.close();
	    } catch(Exception e) {}
		
	}

}


