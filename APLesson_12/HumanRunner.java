import java.util.Scanner; 
public class HumanRunner 
{
	public static void main(String[]args)
	{
		Scanner kb = new Scanner(System.in); 
		
		System.out.println("Enter hair color: ");
		String hair = kb.nextLine();
		
		System.out.println("Enter eye color: ");
		String eye = kb.nextLine();
		
		System.out.println("Enter skin color: ");
		String skin = kb.nextLine();
	
		Human object = new Human(hair,eye,skin);
		
		System.out.println("\nMy info: ");
		
		System.out.println("Hair: "+ object.getHair());
		System.out.println("Eyes: "+ object.getEyes());
		System.out.println("Skin: "+ object.getSkin());
		
		object.setHES("black","black","black");
		System.out.println("\nFriends info: ");
		
		System.out.println("Hair: "+ object.getHair());
		System.out.println("Eyes: "+ object.getEyes());
		System.out.println("Skin: "+ object.getSkin());
		
	
	
	
	}
	
}