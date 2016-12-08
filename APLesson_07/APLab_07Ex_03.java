import java.util.Scanner;
public class APLab_07Ex_03
{
	public static void main (String[]args)
	{
		Scanner kb = new Scanner(System.in);
		System.out.println("Enter number:");
		int number = kb.nextInt();
		int rev = 0;
		getReverse(number,rev);
		
	}
	public static void getReverse(int number,int rev)
	{
		int num = number;
		while(num > 0)
		{
			rev = rev*10;
			rev += (num%10);
			num = (num/10);
		}
		System.out.print(""+number+" reversed is "+ rev);
	}
}