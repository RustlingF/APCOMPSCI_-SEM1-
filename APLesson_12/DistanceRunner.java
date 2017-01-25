import java.util.Scanner; 
public class DistanceRunner 
{
	public static void main (String[]args)
	{
		Scanner kb = new Scanner(System.in);
		
		System.out.println("Enter x1"); 
		int xone = kb.nextInt(); 
		
		System.out.println("Enter y1"); 
		int yone = kb.nextInt(); 
		
		System.out.println("Enter x2"); 
		int xtwo = kb.nextInt(); 
		
		System.out.println("Enter y2"); 
		int ytwo = kb.nextInt(); 
		
		Distance object = new Distance(xone,yone,xtwo,ytwo);
		
		System.out.println("\n");
		System.out.println(xone+","+yone);
		System.out.println(xtwo+","+ytwo);
		System.out.println("Distance = "+ object.getDist());
		
		
		object.setValues(4,3,4,5);
		System.out.println("\n");
		System.out.println(object.getXone()+","+object.getYone());
		System.out.println(object.getXtwo()+","+object.getYtwo());
		System.out.println("Distance = "+ object.getDist());
		
	}
	
	
}