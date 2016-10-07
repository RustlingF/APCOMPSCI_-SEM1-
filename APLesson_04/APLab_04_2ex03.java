import java.util.Scanner;

public class APLab_04_2ex03
{

	static double side;
	static double sa;

	public static void main(String[]args)
	{
		Scanner kb = new Scanner(System.in);
		System.out.println("Enter length of side:");
		side = kb.nextDouble();
		
		calcSurf();
		print();
		
	}
	
	public static void calcSurf()
	{
		sa = 6*(side*side);
	}
	
	public static void print()
	
	{
		System.out.println("Your surface area is "+ sa );
	}
}