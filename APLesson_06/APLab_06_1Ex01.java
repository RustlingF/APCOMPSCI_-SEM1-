import java.util.Scanner;
public class APLab_06_1Ex01
{
	public static void main(String[]args)
	{
		Scanner kb = new Scanner(System.in);
		System.out.println("Enter a number:");
		int num1 = kb.nextInt();
		System.out.println("Enter a number:");
		int num2 = kb.nextInt();
		
		for(int i = num1; i <= num2 ; i+=2)
		{
			System.out.print(i + " ");
		}
		
		
		
		
		
	}
	
	
	
}