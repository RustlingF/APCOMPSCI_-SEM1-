import java.util.Scanner;
public class BMI
{
	public static void main(String[]args)
	{
		Scanner input = new Scanner(System.in);

        double weight = 0;
        double height = 0;
        double bmi = 0;

        System.out.print("Enter your weight in pounds:");
        weight = input.nextInt();

        System.out.print("Enter your height: ");
        height = input.nextInt();

        bmi = ((weight * 703)/(height * height));

        System.out.println("Your BMI is " +bmi);

		
	}
	
	
}