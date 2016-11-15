import java.util.Scanner; 
public class APLab06Ex_01
{
	public static void main(String[]args)
	{
		Scanner keyboard = new Scanner(System.in);
		
		System.out.println("Enter word:");
		String word = keyboard.next();
		
		for(int i = 1; i < word.length();i++)
		{
			System.out.println(word);
		}
	}
}