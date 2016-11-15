import java.util.Scanner;
public class APLab_06_1Ex04
{
	public static void main(String[]args)
	{
		Scanner kb = new Scanner(System.in);
		
		sing("Na ",4);
		sing("Na ",4);
		sing("Na ",4);
		sing("Goodbye",1);
		
		
		
	}
	
	public static void sing(String lyrics , int num1)
	{
		for(int i =1; i <= num1; i++)
		{
			System.out.printf("%s",lyrics);
		}
		System.out.println("");
	}
}