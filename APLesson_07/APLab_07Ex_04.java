import java.util.Scanner;
public class APLab_07Ex_04
{
	public static void main (String[]args)
	{
		Scanner kb = new Scanner(System.in);
		System.out.println("Enter a sentance:");
		String sentance = kb.nextLine();
		
		while(sentance.indexOf("a") >= 0)
		{
			sentance = sentance.replaceAll("a","@"); 
		}
		System.out.println(sentance);
		
	}
}
