package week1.day2;

import java.util.Arrays;

public class LearnArray {

	public static void main(String[] args) {
//		int num1 = 10;
//		int num2 = 20;
		int[] num = new int [5];
		num[0] = 10;
		num[1] = 50;
		num[2] = 30;
		num[3] = 70;
		num[4] = 5;
////		//last data index
////		System.out.println(num.length-1);
////		//to get the single data from array
////		System.out.println(num[1]);
////		//to get last data
////		System.out.println(num[num.length-1]);
//		for (int i=num.length-1; i>=0; i--) {
//			System.out.println(num[i]);
		Arrays.sort(num);
//		for (int i = 0; i < num.length; i++) {
//			System.out.println(num[i]);
//			//		}
		for (int i : num) {
			System.out.println(i);
			
		}
		}
	}


