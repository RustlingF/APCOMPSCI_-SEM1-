import java.util.Scanner; //import Statment 

public class rudeAI
{
	public static void main(String[]args)
	{
		
		Scanner keyboard = new Scanner(System.in);
		System.out.println("Hi, my name is RudeAI.");
		System.out.println("I'd like to ask you a few questions.");
		System.out.println("What is your name?");
		String name = keyboard.next();
		System.out.println("So your name is  " +name+ "!!!! What kind of name is that.");
		
		//next question 
		
		System.out.println("How old are you?");
		int age = keyboard.nextInt();
		System.out.println("So you are "+age+"??!?!? YOLO");

		
		//next question 
		System.out.println("What do you do for fun?");
		keyboard.nextLine();
		String activ = keyboard.nextLine();
	
		System.out.println("You "+activ+" for fun!!! That is boring :((");
		keyboard.nextLine();
		//next question
		System.out.println("What kind of music do you like?");

		String music = keyboard.next();
	
		System.out.println("Your favorite music is "+music+". What are you a from the south");
		
		//next question
		System.out.println("How many siblings do you have?");
		int sibsnum = keyboard.nextInt();
		System.out.println("So you have "+sibsnum+"??!?!? Man your parents don't waste anytime....");
		//next question 
		System.out.println("What do you want to be when you grow up?");

		String growup = keyboard.next();
	
		System.out.println("Wow...." + growup + " is such a useless carear path");
		
		
	}
}
