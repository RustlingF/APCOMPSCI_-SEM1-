import java.util.Scanner; 

public class APLab_05_1ex04
{
		static double weight;
        static double height;
        static double bmi;
		static String condition;
	
	public static void main(String[]args)
	{
		
		Scanner input = new Scanner(System.in);

        
        System.out.print("Enter your weight in pounds:");
        weight = input.nextInt();

        System.out.print("Enter your height: ");
        height = input.nextInt();

        bmi = ((weight * 703)/(height * height));
		
		calccondish();

        System.out.println("Your BMI is " +bmi);
		System.out.println("Your condition is "+ condition);
		
	}
	
	public static void calccondish()
	{ 
		if(18.5 > bmi )
			condition = ("condition is underweight ");
		else if (bmi < 24.9)
			condition = ("condition is normal ");
		else if(bmi < 25)
			condition = ("you are overweight");
		else if(bmi < 29.9)
			condition = ("you are obese");
		else if(bmi<35)
			condition = ("you are very obese");
		else
			condition = ("you are morbidly obese");
	}
}