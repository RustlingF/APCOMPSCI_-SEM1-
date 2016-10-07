import java.util.Scanner;

public class AP_Lab04_3ex2
{
	public static void main(String[]args)
	{
		
		Scanner kb = new Scanner(System.in);
		
		System.out.println("Enter first number:");
		double n1 = kb.nextDouble();
		System.out.println("Enter second number:");
		double n2 = kb.nextDouble();
		System.out.println("Enter third number:");
		double n3 = kb.nextDouble();
		print(calcAvg(n1,n2,n3));
	}
	public static double calcAvg(double n1, double n2,double n3)
	{
		return (n1+n2+n3)/3;
	}
	public static void print(double average)
	{
		
		System.out.println("The average is " + average);
	}
	
}