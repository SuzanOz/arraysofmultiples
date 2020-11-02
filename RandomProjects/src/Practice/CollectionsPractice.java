package Practice;
	
	import java.util.ArrayList;
	import java.util.List;
	import java.util.ListIterator;

	public class CollectionsPractice {
	
		public static void main(String[] args) {
			List<String> list2 = new ArrayList<>();
			list2.add("Monty");
			list2.add("Clarke");
			list2.add("Raven");
			list2.add("Bellamy");
			System.out.println(list2);
			
			// Change the elements permanently with for-each loop . Let's do all names upperCase

			for(String w : list2) {
	            
	            list2.set(list2.indexOf(w), list2.get(list2.indexOf(w)).toUpperCase());
	        }
			
			System.out.println("");
			System.out.println(list2);
			
			//  Change the elements permanently with for loop Let's do all names lowerCase

			for (int i=0; i<list2.size(); i++) {
	            list2.set(i, list2.get(i).toLowerCase());
	        }
	        System.out.println(list2);
	        
	        
	        //Change the elements permanently with iterator. Let's do all names uppercase
	        // You need to use iterator for changing collections permanently

	       ListIterator<String> it1 = list2.listIterator();
	        
	        
	        while(it1.hasNext()) {
	            String el = it1.next();
	            it1.set(el=el.toUpperCase());
	            System.out.print(el+" ");
	            
	        }
	        System.out.println(" ");
	        System.out.println("after iterator" + list2);

		}


	}


