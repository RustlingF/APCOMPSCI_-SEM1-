import java.util.Scanner;
public class InventoryItemsRunner
{
	public static void main(String[]args)
	{
		Scanner kb = new Scanner(System.in);
		
		System.out.println(" Enter the category and price information?");
		System.out.println("[1] Yes");
		System.out.println("[2] No");
		int response = kb.nextInt();
		kb.nextLine();
		if(response == 1)
		{
			System.out.println("The name of the item?");
			String i = kb.nextLine();
			
			System.out.println("What is its manufactorer?");
			String m = kb.nextLine();
			
			System.out.println("What is the category of the item?");
			String cato = kb.nextLine();
			
			System.out.println("The price of the item?");
			String p = kb.nextLine();
			
			InventoryItems object = new InventoryItems(m, i, cato, p);
			System.out.println(object);
		}
		else if(response == 2)
		{
			System.out.println("The name of the item?");
			String i = kb.nextLine();
			System.out.println("What is the manufactorer?");
			String m = kb.nextLine();
			InventoryItems object = new InventoryItems(m, i);
			System.out.println(object);
		}
		else
		{
			System.out.println("NO INFO!!!");
		}
	}
}