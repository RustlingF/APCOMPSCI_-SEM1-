import java.util.Scanner;
public class APLab_09Ex01
{
	public static void main(String[]args)
	{
		String [] names = new String[5];
		Scanner kb = new Scanner(System.in);
		System.out.println("Enter 5 names:");
		
		
		for(int i = 0; i < names.length;i++)
		{
			names[i] = kb.next();
		}
		System.out.println("In order...");
		
		for(String name : names)
		{
			System.out.println(name);
		}
		
		System.out.println();
		System.out.println("Reversed...");
		reverse(names);
		
	}
	public static void reverse(String[] names)
	{
		int sum = 0;
		for(int i = names.length-1; i >= 0; i--)
		{
			System.out.println(names[i]);
		}
	}
}