import java.util.Scanner;
public class APLab06_Ex_02
{
	public static void main(String[]args)
	{
		Scanner kb = new Scanner (System.in);
		System.out.println("Enter a number:");
		int number=  kb.nextInt();
		int Factor = 1;
		for(int i = 1; i <= number; i++)
		{
			Factor = Factor*i;
		}
		System.out.println(Factor);
	}
}