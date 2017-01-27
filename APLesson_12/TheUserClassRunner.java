import java.util.Scanner;
public class TheUserClassRunner
{
	public static void main(String[]args)
	{
		Scanner kb = new Scanner(System.in);
		
		System.out.println("Enter first name: ");
		String firstName = kb.nextLine();
		
		System.out.println("Enter last name: ");
		String lastName = kb.nextLine();
		
		System.out.println("Would you like an avatar name?");
		System.out.println("[1] Yes");
		System.out.println("[2] No");
		int answer = kb.nextInt();
		kb.nextLine();
		
		if(answer == 1)
		{
			System.out.println("Enter avatar name: ");
			String avatar = kb.nextLine();
			TheUserClass object = new TheUserClass(firstName, lastName, avatar);
			System.out.println(object);
		}
		else if(answer == 2)
		{
			TheUserClass object = new TheUserClass(firstName, lastName);
			System.out.println(object);
		}
		else
			System.out.println("TRY AGAIN!!!!");
	}
}