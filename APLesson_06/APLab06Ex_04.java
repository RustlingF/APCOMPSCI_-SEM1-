import java.util.Scanner;
public class APLab06Ex_04
{
	public static void main(String[]args)
	{
		Scanner kb = new Scanner (System.in);
		System.out.println("Enter a number:");
		int number =  kb.nextInt();
		System.out.println("Enter size of table:");
		int table = kb.nextInt();
		
		for(int i = 1; i <= table;i++)
		{
			System.out.printf("%10d  %10d \n",i,i*number);
		}
		
	}
}