import java.util.Scanner; 
public class MPHRunner 

{
	public static void main (String[]args)
	{
		Scanner kb = new Scanner(System.in);
		
		System.out.println("Enter distance:");
		int d = kb.nextInt();
		
		System.out.println("Enter hours:");
		int h = kb.nextInt();
		
		System.out.println("Enter minutes:");
		int m = kb.nextInt();
	
		MilesPerHour object = new MilesPerHour(d,h,m);
		
		System.out.println(d+" miles in " +h+ "hours ="+object.getMPH());
		
	
	
	}
	
	
	
}
	