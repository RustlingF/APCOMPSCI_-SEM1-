import java.util.Scanner;
public class APLab_08Ex_02
{
	public static void main(String[]args)
	{
		Scanner kb = new Scanner(System.in);
		System.out.println("Enter word 1:");
		String word1 = kb.next();
		
		System.out.println("Enter word 2:");
		String word2 = kb.next();
		
		System.out.println("Enter word 2:");
		String word3 = kb.next();
		
		makeCenter(word1,20);
		makeCenter(word2,20);
		makeCenter(word3,20);
		
	}
	
	public static String makeCenter(String word, int number)
	{
		if(word.length() >= number)
		{
			System.out.println(word);
		}
		
		else
		{
			makeCenter(" "+word+" ",number);
		}
		return ""; 
	}
	
	
	
	
}