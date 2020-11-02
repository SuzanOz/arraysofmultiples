package Arrays;

public class ArrayDoubleExist {

	public static void main(String[] args) {
		int arr[] = {-2,0,10,-19,4,6,-8};
		int mul = 0;
		int c = 0;
		boolean result = false;
		for (int j = 0; j < arr.length; j++) {
			mul = arr[j]*2;
			
			for (int i = 0; i < arr.length; i++) {
				if(arr[i]==mul && c!=i) {
					result = true;
					break;
				}
			}c++;
		}System.out.println(result);
	}

}
