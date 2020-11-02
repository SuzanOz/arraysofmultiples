package bookstoreinventory;

	import java.util.HashMap;
	import java.util.Map.Entry;
	import java.util.Scanner;

	public class BookStoreInventory {
		static int id = 1000;
		static String name;
		static String author;
		static String year;
		static double price;
		static Scanner scan = new Scanner(System.in);
		static HashMap<Integer, String> books = new HashMap<>();
		/*
		Let’s write an application for bookstores
		 Rules
		•You should create book id for every book. It should be start from 1000
		•Every book should have some information like name, author, year of publication and price
		•Program should start with a menu for user can pick any option
		  1) add book
		  2) search by book id
		  3) search by any information
		  4) delete by book id
		  5) List all books
		  6) Quit
		*/
		
		public static void main(String[] args) {
			
			addSomeBooks();
			menu();
			
			
			
			
			
			
		}	
			
		public static void menu() {
			Scanner scan = new Scanner(System.in);
			System.out.println("Which option do you want to proceed:\r\n"
					+ "   1) add book\r\n"
					+ "	  2) search by book id\r\n"
					+ "	  3) search by any information\r\n"
					+ "	  4) delete by book id\r\n"
					+ "	  5) List all books\r\n"
					+ "	  6) Quit");
			int option = scan.nextInt(); 
			switch(option){
				case 1:
					addBook();
					break;
				case 2:
					searchById();
					break;
				case 3:
					searchByInfo();
					break;
				case 4:
					deleteById();
					break;
				case 5:
					listAllBooks();
					break;
				case 6:
					quit();
					break;
				default:
					System.out.println("Please enter an option between 1 t0 6!");
				}	
			}

		private static void quit() {
			System.out.println("Thank you for visiting our store!");
			
		}

		private static void listAllBooks() {
			if(!books.isEmpty()) {
			 for (Integer keys : books.keySet())  
				{
				   System.out.println(keys + ":"+ books.get(keys));
				}
			}else {
				System.out.println("There is no book at this time!");
			}
			menu();
		}

		private static void deleteById() {
			System.out.println("Enter the book id to delete:");
			int input = scan.nextInt();
				if(!books.containsKey(input)) {
					System.out.println("The book doesn't exist!");
				}else
					System.out.println("The book" + books.remove(input) + "was successfully deleted!");
				menu();	
			
		}

		public static void searchByInfo() {
			System.out.println("Enter the book info to search(name/author/year/price):");
			String input = scan.next();
			int flag=0;
			for (Entry<Integer, String> entry : books.entrySet()) {
				if (entry.getValue().contains(input)) {
					System.out.println("Id = " + entry.getKey() + ", Book Information= " + entry.getValue());
					flag++;
				}
			} if(flag==0) {
				System.out.println("The book doesn't exist!");}
			System.out.println("============================");
			menu();
			}


		private static void searchById() {
			System.out.println("Enter the book id to search:");
			int input = scan.nextInt();
				
			if(!books.containsKey(input))
				System.out.println("This book doesnt exist");
		    else
		    	System.out.println(books.get(input));

			menu();	
		}

		public static void addBook() {
		
				System.out.println("Enter the book name:");
				name = scan.nextLine();
				System.out.println("Enter the author:");
				author = scan.nextLine();
				System.out.println("Enter the publication year:");
			    year = scan.nextLine();
				System.out.println("Enter the price:");
				price = scan.nextDouble();
				String information = name + author + year + price ;
				books.put(id, information);
				id++;
				menu();
		}
		public static void addSomeBooks() {
			books.put(9999, "Lords, John , 2001, 11");
			books.put(9998, "Countries, Ted, 2005, 10");
			books.put(9997, "Illness, Tulin, 2005, 21");
			books.put(9996, "Roads, Suzan, 2005, 30");		
		}

		

	}


