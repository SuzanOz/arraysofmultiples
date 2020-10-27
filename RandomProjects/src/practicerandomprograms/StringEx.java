package practicerandomprograms;

public class StringEx {

	public static void main(String[] args) {
		String txt = "helloWorld";
		String first = "";
		String second = "";
		for(int i=0; i<txt.length(); i++ ){
			if (txt.charAt(i)>='A' && txt.charAt(i)<='Z' ){
				
				second = (txt.substring(i)).toLowerCase();
				
    			first = txt.substring(0,i);
    			
				System.out.println(first + " " + second);
			}
		}
	}

}
