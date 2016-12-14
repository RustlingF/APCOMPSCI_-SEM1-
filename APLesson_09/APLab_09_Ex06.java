import java.util.Scanner;
public class APLab_09_Ex06
{
	static int[] numbers ;
	
	public static void main(String[]args)
	{
		numbers  = new int[10];
		fillArray();
		System.out.print("For the follwoing numbers ");
		printArray();
		System.out.print("\n There biggest number is "+ getBiggest());
		
		
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
		for(int num: numbers)
		{
			System.out.print(num +" ");
		}
	}
	public static int getBiggest()
	{
		int max = 0 ;
		for(int num : numbers)
		{
			if (num > max)
				max = num;
		}
		return max ; 
	}
}