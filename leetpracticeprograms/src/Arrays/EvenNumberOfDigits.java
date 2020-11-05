package Arrays;

public class EvenNumberOfDigits {

	public static void main(String[] args) {
		
		int nums[] = {12, 3, 1234, 2342};
		int count = 0, digits = 0;
		for (int i = 0; i < nums.length; i++) {
			int number = nums[i];
			digits = 0;
			while(number>0) {
				number = (int)number / 10;
				digits++;
			}
			if(digits%2==0)
				count++;
		}
		System.out.println(count);
	}
}
