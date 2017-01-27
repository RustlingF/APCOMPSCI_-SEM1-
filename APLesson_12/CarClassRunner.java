import java.util.Scanner;

public class CarClassRunner
{
	public static void main(String[]args)
	{
		Scanner kb = new Scanner(System.in);
		
		System.out.println("Enter a paint color:");
		
		String paint = kb.nextLine();
		
		System.out.println("Enter an interior type: ");
		
		String interior = kb.nextLine();
		
		System.out.println("Enter the type of engine: ");
		String engine = kb.nextLine();
		
		System.out.println("Enter the type of tires: ");
		String tires = kb.nextLine();
		
		CarClass object = new CarClass(paint, interior, engine, tires);
		
		System.out.println("\nYour vehicle is ready\n");
		
		System.out.println("Paint : " + object.getPaint());
		System.out.println("Interior : " + object.getInterior());
		System.out.println("Engine : " + object.getEngine());
		System.out.println("Tires : " + object.getTires());
	}
}