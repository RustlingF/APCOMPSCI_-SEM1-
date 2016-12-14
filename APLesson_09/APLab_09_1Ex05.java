import java.util.Random; 
public class APLab_09_1Ex05 
{
	
	static int[] numbers; 
	static Random rng = new Random();
	
	public static void main(String[]args)
	{
		numbers = new int[10];
		
		fillArray();
		System.out.print("For the following numbers ");
		printArray();
		System.out.print("\n "+getOdds(numbers)+ " are odd numbers");
		
	}
	public static void fillArray()
	{
		for(int i = 0; i < numbers.length;i++)
		{
			numbers[i] =(int)(Math.random()*100)+1;
		}
		
	}
	public static void printArray()
	{
		for(int num : numbers)
		{
			System.out.print(num + " ");
		}	
	}
	public static String getOdds(int[] numbers)
	{
		String odds = ("");
		for(int num: numbers)
		{
			if(num%2!= 0)
				odds += num + " "; 
			
			
		
		}
		return odds ; 
	}
	
	
	
}