package UserDBHashMap;

import java.io.File;
import java.io.FileInputStream;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.StringTokenizer;

public class GetInfo {
	/*
	  Create getInfo() method
	  1) Get personal information by using SSN
	  2) If SSN doesn't exist, give an error message then ask user to enter again.
	 */
	static Scanner scan = new Scanner(System.in);

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

