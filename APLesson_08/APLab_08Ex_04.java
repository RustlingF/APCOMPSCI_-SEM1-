import java.util.Scanner; 
public class APLab_08Ex_04
{
	
	public static void main(String[]args)
	{
		Scanner kb = new Scanner(System.in);
		System.out.println("Enter a word ");
		String word = kb.next();
		int stop = word.length();
		tree(word,0,stop);
		
	}
	public static String tree(String word,int start,int stop)
	{
		while(stop >= start)
		{
			System.out.printf("%10s \n",word.substring(0,start));
			return tree(word,start + 1,stop);
		}
		return ""; 
	}
}