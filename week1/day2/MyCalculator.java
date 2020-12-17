package week1.day2;

public class MyCalculator {

	public static void main(String[] args) {
		Calculator calc = new Calculator();
		int add = calc.add(10, 20, 30);
		System.out.println(add);
		int sub = calc.sub(20, 10);
		System.out.println(sub);
		double mul = calc.mul(20.30, 40.50);
		System.out.println(mul);
		
   
	}

}
