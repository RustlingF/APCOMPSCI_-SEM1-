import java.util.Scanner;
public class APLab_06_1Ex03
{
	public static void main(String[]args)
	{
		Scanner kb = new Scanner(System.in);
		
		System.out.println("Enter word:");
		String word = kb.next();
		
		for(int i = word.length(); i >= 0; i--)
		{
			
			System.out.println(word.substring(i,word.length()));
		}
		
		
		
		
		
	}
}