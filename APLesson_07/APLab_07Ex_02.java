import java.util.Scanner;
public class APLab_07Ex_02
{
	public static void main (String[]args)
	{
		Scanner kb = new Scanner(System.in);
		System.out.println("Enter number:");
		int number =kb.nextInt();
		int digits = 0;
		double average = 0; 
		avDigits(number,digits,average);
	}
	public static void avDigits(int number,int digits,double average)
	{
		int num = number;
		while(num > 0)
		{
			digits += 1;
			average += (num%10);
			num = (num/10);
			
		}
		average = average/digits;
		
		System.out.println("The average of the digits in "+number+" is "+average);
	}
	
}
