import java.util.Scanner;
public class Ex_03
{
	public static void main(String[]args)
	{
		Scanner input = new Scanner(System.in);

        double base = 0;
        double height = 0;
        double area = 0;

        System.out.print("Enter base of triangle:");
        base = input.nextInt();

        System.out.print("Enter height of triangle:");
        height = input.nextInt();
		
		area = (height*base)/(2);

        System.out.println("Area of triangle is "+ area);

		
	}
	
	
}