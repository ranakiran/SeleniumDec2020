package week1.day2;

public class Armstrong {

	public static void main(String[] args) {
		int input = 153;
		int originalInput = input;
		int sum = 0;
		while (input > 0) {
			int rem = input % 10;
			sum = sum + (rem*rem*rem);
			//change the number from 153 to 15
			input = input  / 10;
		} 
		if (sum == originalInput) {
			System.out.println("GIVEN NUMBER IS ARMSTRONG");
			
		}
		else {
			System.out.println("GIVEN NUMBER IS NOT ARMSTRONG");
		}
			
	}

}
