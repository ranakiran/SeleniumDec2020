package week1.day2;

import java.util.Scanner;

public class Factorial {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("ENTER THE INPUT FOR FACTORIAL CALICULATION");
		int input = scan.nextInt();
				
		//int input = 10;
		
		int fact = 1;
		for (int i = 1; i <= input; i++) {
			fact = fact * i;	
						
		}
		System.out.println("FACTORIAL OF THE NUMBER IS " +fact);
		
	}

}

