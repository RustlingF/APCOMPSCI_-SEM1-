import java.util.Scanner; 
public class APLab_09Ex03
{
	public static void main(String[]args)
	{
		Scanner kb = new Scanner(System.in);
		int [] numbers = new int[10];
		for(int i = 0; i < numbers.length; i++)
		{
			numbers[i] = (int)(Math.random() *100)+1;
		}
		System.out.println("numbers:");
		
		for(int n: numbers)
		{
			System.out.print(n+"\n");
		}
		System.out.println("");
		System.out.println("The average of the above numbers is "+average(numbers));
		
	}
	public static float average(int[] nums)
	{
		float average = 0;
		for(int n : nums)
		{
			average += n;
			
		}
		return average/((float)nums.length);
	}
}