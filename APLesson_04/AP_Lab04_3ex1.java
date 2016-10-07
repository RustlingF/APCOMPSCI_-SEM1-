import java.util.Scanner;

public class AP_Lab04_3ex1
{
	public static void main(String[]args)
	{
		
		Scanner kb = new Scanner(System.in);
		
		System.out.println("Enter length of recrangle:");
		double l = kb.nextDouble();
		System.out.println("Enter width of recrangle:");
		double w = kb.nextDouble();
		print(calcPerim(l,w));
	}
	public static double calcPerim(double l, double w)
	{
		return 2*(l+w);
	}
	public static void print(double perimeter)
	{
		
		System.out.println("The perimeter of your rectangle is " + perimeter);
	}
	
}