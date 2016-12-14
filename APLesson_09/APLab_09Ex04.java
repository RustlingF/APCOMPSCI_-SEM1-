import java.util.Scanner;
public class APLab_09Ex04
{
	public static void main(String[]args)
	{
		Scanner kb = new Scanner(System.in);
		System.out.println("Enter starting number");
		int number1 = kb.nextInt();
		System.out.println("Enter sequence size");
		int number2 = kb.nextInt(); 
		
		int[] seq = new int[number2]; 
	
	for(int i = 0; i < seq.length;i++)
	{	if(i==0 || i==1)
			seq[i] = number1;
	
		else
			seq[i]= seq[i-2]+seq[i-1];
		System.out.print(seq[i] + " ");
	}
	}
}