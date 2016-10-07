import java.util.Scanner;

public class AP_Lab04_3ex3
{
	public static void main(String[]args)
	{
		
		Scanner kb = new Scanner(System.in);
		
		System.out.println("Enter side of cube:");
		double s = kb.nextDouble();
		print(calcSurf(s));
	}
	public static double calcSurf(double s)
	{
		return 6*(s*s);
	}
	public static void print(double surface)
	{
		
		System.out.println("The surface area of the cube is  " + surface);
	}
	
}