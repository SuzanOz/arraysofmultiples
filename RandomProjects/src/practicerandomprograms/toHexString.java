
package practicerandomprograms;

public class toHexString {

	public static void main(String[] args) {
		String str = "hello world";
		String output = "";
		int i = 0;
		for(char c : str.toCharArray()){
			output+= Integer.toHexString((int) c);
			i++;
			if(i<str.length()){
				output+=" ";
			}
		}
		System.out.println(output);
	}
}