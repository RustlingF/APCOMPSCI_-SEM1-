import java.util.Scanner; //import Statment 

public class APLab_04
{
	public static void main(String[]args)
	{
		APLab_04 form = new APLab_04();
		
		Scanner keyboard = new Scanner(System.in);
		
		System.out.println("Please enter item 1:");
		String item1 = keyboard.nextLine();
		System.out.println("Please enter price:");
		double price1 = keyboard.nextDouble();
		
		keyboard.nextLine();
		
		System.out.println("Please enter item 2:");
		String item2 = keyboard.nextLine();
		System.out.println("Please enter price:");
		double price2 = keyboard.nextDouble();
		
		keyboard.nextLine();
		
		System.out.println("Please enter item 3:");
		String item3 = keyboard.nextLine();
		System.out.println("Please enter price:");
		double price3 = keyboard.nextDouble();
		
		keyboard.nextLine();
		
		System.out.println("Please enter item 4:");
		String item4 = keyboard.nextLine();
		System.out.println("Please enter price:");
		double price4 = keyboard.nextDouble();
		
		keyboard.nextLine();
		
		double Subtotal = price1+price2+price3+price4;
		double tax = (price1+price2+price3+price4)*0.15;
		double Total= tax+Subtotal;
		
		
		String dots1 = " ....................";
		System.out.println("<<<<<<<<<<<<<<<__Receipt__>>>>>>>>>>>>>>>>");
		form.format(item1,dots1,price1);
		form.format(item2,dots1,price2);
		form.format(item3,dots1,price3);
		form.format(item4,dots1,price4);
		
		System.out.println("\n Subtotal: "+ Subtotal);
		System.out.println("Tax: "+ tax);
		System.out.println("Total: "+ Total);
	}
	public void format(String word,String dots1, double number )
	{
		
		System.out.printf("\n%15s  %20s %10.2f", word, dots1, number );
	}
	
}