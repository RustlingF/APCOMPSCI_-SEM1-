import java.util.Scanner;
public class APLab_05_2_ex06
{
	static Scanner keyboard;
	public static void main(String[]args)
	{
		keyboard = new Scanner(System.in);
		passw0rd(); 
	}
	public static void passw0rd()
	{
		System.out.println("Enter username:");
		String username1 = keyboard.nextLine();
		
		System.out.println("Enter password:");
		String password1 = keyboard.nextLine();
		
		if (username1.equals("SWAGLORD") && password1.equals("12345"))
			System.out.println("You are granted access!");
		else if(username1.equals("SWAGLORD"))
			System.out.println("Your password is incorrect!");
		else if(password1.equals("12345"))
			System.out.println("Your username is incorrect!");
		else 
			System.out.println("Your username and password are incorrect!");
		
	}
	
}