package UserDBHashMap;

import java.io.File;
import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.util.HashMap;
import java.util.Scanner;

public class UserInfo {
	static Scanner scan = new Scanner(System.in);
	/*
	  Create saveInfo() Method
	  1) Get SSN(9 digits), full name, address, phone number from multiple user.
	  2) Put data into a map like; SSN will be key, all the other informations will be values.
	  3) If user tries to use repeated SSN, give an error message and ask user to enter a new ssn
	  4) Tell user to stop entrance by pressing "Q".
	 */
public static void select(String option, HashMap<String, String> user) {
		
		Scanner scan = new Scanner(System.in);
		
		do {
			
			System.out.println("Select option (1-2-3)");
			System.out.println("1: Add data\n2: Get data\n3:Delete data");
			System.out.println("To end the program press'Q'");
			option = scan.next();
			if(option.equalsIgnoreCase("Q")) {
				break;
			}
			switch(option) {
				case "1":
					addUser(user);
					break;
				case "2":
					getInfo(user);
					break;
				case "3":
					removeUser(user);
					break;
			}
			
		}while(true);
	}
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
	        //ObjectOutputStream oos=new ObjectOutputStream(fos);

//	        oos.writeObject(user);
//	        oos.flush();
//	        oos.close();
	        fos.close();
	    } catch(Exception e) {}
		
	}
	/*
	 Create removeInfo() method
	  1) Remove data by using SSN
	  2) If SSN doesn't exist give a message to the user, and ask to enter again
	  3) If the map is empty, give a message to the user and end the program.
	 */
	public static void removeUser(HashMap<String, String> hm) {
		
		Scanner scan = new Scanner(System.in);
		String ssn = "";
		
		do {
			System.out.println("Enter SSN to remove data");
			System.out.println("To stop removing press 'Q'");
			ssn = scan.next();
			if(ssn.equalsIgnoreCase("Q")) {
				break;
			}
			if(hm.isEmpty()) {
				System.out.println("There is no any data to remove");
				break;
			}else if(hm.containsKey(ssn)) {
				String removedData = hm.remove(ssn);
				System.out.println("Removed Data:\n" + removedData);
			}else {
				System.out.println(ssn + " is not valid. Please enter a valid SSN");
			}	
		}while(true);
		
		System.out.println(hm);
		scan.close();
	 }
	public static void getInfo(HashMap<String, String> user) {
		System.out.println("Enter the SSN to look up a user:");
		String ssn = scan.next();
		if(user.isEmpty()) {
			System.out.println("There is no data to display");
			
		}
		System.out.println(user.getOrDefault(ssn, "Sorry, the SSN doesn't exist."));
		scan.nextLine();
		

	  }

}


