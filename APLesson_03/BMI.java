import java.util.Scanner;
public class BMI
{
	public static void main(String[]args)
	{
		scanner input = new Scanner(System.in);

        double weight = 0;
        double height = 0;
        double bmi = 0;

        System.out.print("Enter your weight in pounds:");
        weight = input.nextInt();

        System.out.print("Enter your height: ");
        height = input.nextInt();

        bmi = ((weight * 703)/(height * height));

        System.out.printf("Your BMI is %bf\n", bmi);

        System.out.println("BMI VALUES");
		
	}
	
	
}