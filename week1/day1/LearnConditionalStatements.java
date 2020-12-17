package week1.day1;

public class LearnConditionalStatements {
	
	public static void main(String[] args) 
	{
		int age = -2;
		if (age < 18) 
			{
			System.out.println("MINOR");
			}else if (age >= 18 && age <60)
			{
			System.out.println("ADULT");
			}else if (age >=60 && age < 80) 
			{
			System.out.println("SENIOR CITIZEN");
			}else System.out.println("SUPER SENIOR");
	}

}
