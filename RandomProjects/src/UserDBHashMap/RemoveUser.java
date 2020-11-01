package UserDBHashMap;

import java.util.HashMap;
import java.util.Scanner;

public class RemoveUser {
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
}
