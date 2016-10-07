import java.util.Scanner; //import Statment 

public class APLab_04ex2
{
	public static void main(String[]args)
	{
		APLab_04ex2 card = new APLab_04ex2();
		
		Scanner keyboard = new Scanner(System.in);
		
		System.out.println("Please enter first name:");
		String name1 = keyboard.nextLine();
		
		System.out.println("Please enter last name:");
		String name2 = keyboard.nextLine();
		
		keyboard.nextLine();
		
		System.out.println("Enter job title:");
		String title1 = keyboard.nextLine();
		
		System.out.println("Enter the school site:");
		String site1 = keyboard.nextLine();
		
		keyboard.nextLine();
		
		System.out.println("Enter the school year:");
		String school1 = keyboard.nextLine();
		
		keyboard.nextLine();
		
		System.out.println("What is your subject?");
		String sub4 = keyboard.nextLine();
		
		keyboard.nextLine();
		
		System.out.println("************************");
		card.format(site1,sub4);
		card.format(name1,name2); 
		card.format(title1,school1);
		System.out.println("************************");
	}
	public void format(String word, String word2)
	{
		
		System.out.printf("*%14s%18s *%n", word,word2);
		
	}
	
}