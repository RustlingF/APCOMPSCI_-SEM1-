import java.util.Scanner;

public class APLab_05ex_02
{
	public static void main(String[]args)
	{
		APLab_05ex_02 form = new APLab_05ex_02();
		
		Scanner keyboard = new Scanner(System.in);
		
		System.out.println("Enter First item:"); 
		String item1 = keyboard.nextLine();  
		System.out.println("Enter price for First item:");
		double price1 = keyboard.nextDouble();
		
		keyboard.nextLine();
		
		System.out.println("Enter Second item:"); 
		String item2 = keyboard.nextLine();  
		System.out.println("Enter price for Second item:");
		double price2 = keyboard.nextDouble();
		
		keyboard.nextLine();
		
		System.out.println("Enter Third item:"); 
		String item3 = keyboard.nextLine();  
		System.out.println("Enter price for Third item:");
		double price3 = keyboard.nextDouble();
		
		keyboard.nextLine();
		
		
		System.out.println("Enter Fourth item:"); 
		String item4 = keyboard.nextLine();  
		System.out.println("Enter price for Fourth item:");
		double price4 = keyboard.nextDouble();
		
		keyboard.nextLine();
		
		double Subtotal = price1 + price2 + price3 + price4; 
		double Discount = discount(Subtotal);
		double tax = (price1 + price2 + price3 + price4)*0.15;
		double Total = tax+Subtotal-Discount;
		
		String dots1 = " ....................";
		System.out.println("<<<<<<<<<<<<<<<__Receipt__>>>>>>>>>>>>>>>>");
		form.format(item1,dots1,price1);
		form.format(item2,dots1,price2);
		form.format(item3,dots1,price3);
		form.format(item4,dots1,price4);
		
		System.out.println("\n ____________________________________________");
		form.format("Subtotal: ",dots1,Subtotal);
		form.format("Tax: ",dots1,tax);
		form.format("Total: ",dots1,Total);
		
	}
	
	public static double discount(double Subtotal)
	{
	double discount = 0.0;
	if (Subtotal >=2000)
		return Subtotal*0.15;
	return 0.0; 
	}	
	
	public void format(String word,String dots1, double number )
	{
		
		System.out.printf("\n%15s  %20s %10.2f", word, dots1, number );
	}
	
	
	
}