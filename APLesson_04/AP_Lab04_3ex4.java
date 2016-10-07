import java.util.Scanner;

public class AP_Lab04_3ex4
{
	public static void main(String[]args)
	{
		
		Scanner kb = new Scanner(System.in);
		
		System.out.println("Enter radius of circle:");
		double r = kb.nextDouble();
		print(calcRad(r));
	}
	public static double calcRad(double r)
	{
		return 3.14*(r*r);
	}
	public static void print(double radius)
	{
		
		System.out.println("The area of a circle is " + radius);
	}
	
}