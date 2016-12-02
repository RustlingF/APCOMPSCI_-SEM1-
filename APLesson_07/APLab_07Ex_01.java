import java.util.Scanner;
public class APLab_07Ex_01
{
	
	public static void main(String[]args)
	{
		Scanner kb = new Scanner(System.in);
		System.out.println("Please enter a number:");
		int num = kb.nextInt();
		int sum = 0;
		sumDigits(num,sum);
		
		
	}
	public static void sumDigits(int num,int sum)
	{
		while(num > 0)
		{
		sum = sum +(num % 10);
		num = num / 10;
			
		}
		System.out.println("The sum of the digits in your number is "+ sum);
		
	}
	
	
	
}