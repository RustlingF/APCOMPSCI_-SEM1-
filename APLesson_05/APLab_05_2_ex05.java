import java.util.Scanner;
public class APLab_05_2_ex05 
{
	static Scanner keyboard;
	public static void main(String[]args)
	{
		keyboard = new Scanner(System.in);
		responnse();
	}
	public static void responnse()
	{
		System.out.println("There once was a penguin named Jamal.\n");
		System.out.println("He lived in the woods along side his other friends; a monkey, a siberian elk and a worm\n");
		System.out.println("Having just awaken Jamal set off to......");
		
		System.out.println("Go visit Mr.Worm");
		System.out.println("Stay in bed and eat pankcakes");
		
		System.out.println("Enter choice:");
		String choice1 = keyboard.nextLine();
		
		if (choice1.equals("Visit"))
			System.out.println("Jamal set off to Mr.Worms house. On his way there Mr.Elk ask if can tag along");
			System.out.println("Jamal tells him to go away");
			System.out.println("Jamal allows him to tag along");
			String choice2 = keyboard.nextLine();
			if(choice2.equals("go away"))
				System.out.println("Jamal tells Mr.Elk to go away.  This causes Mr.elk to start crying as he runs away.");
			if(choice2.equals("tag along"))
				System.out.println("Jamal allows him to tag along.  They continue to Mr.Worms house.");
		
		if (choice1.equals("Stay"))
			System.out.println("Jamal stayed home and ate pancakes. As he started to fall asleep he drops his T.V remote.");
		
		
		
		
		
		
		
		
		
		
	
	}
	
	
}