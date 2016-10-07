import java.util.Scanner;

public class APLab_04_2ex04
{

	static double r;
	static double area;

	public static void main(String[]args)
	{
		Scanner kb = new Scanner(System.in);
		System.out.println("Enter radius:");
		r = kb.nextDouble();
		
		calcArea();
		print();
		
	}
	
	public static void calcArea()
	{
		area = 3.14*(r*r);
	}
	
	public static void print()
	
	{
		System.out.println("The area of the circle is "+ area );
	}
}