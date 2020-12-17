package week1.day2;

public class PrimeNumber {

	public static void main(String[] args) {
		int input = 10;
		int count = 0;
		for (int i=1; i<=13; i++) {
			
			if (input % i == 0) {
				count = count + 1;
			}
						
		}
		if (count == 2) {
			System.out.println("GIVEN NUMBER IS PRIME");
		}
		else System.out.println("GIVEN NUMBER IS NOT PRIME");
		}

	}


