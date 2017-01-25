import java.util.Scanner;

public class GameHealth
{
	static String[] health;
	static int HEALTHBAR = 6;
	static int healthCount;
	
	public static void main(String[]args)
	
	{
		
		Scanner kb = new Scanner(System.in);
		String turn = "";
		int damage = 0;
		int amount = 0;
		healthCount =6;
		health = new String[HEALTHBAR] ;
		
		
		while(!turn.equals("Q") && healthCount > 0)
		
		{
			
			System.out.print("PLAYER turn....Hit 'Enter': ");
			turn = kb.nextLine();
			damage = (int)(Math.random()*2) + 1;
			amount = (int)(Math.random()*6) + 1;
			System.out.println(takeDamage(damage,amount));
			printClip();
			System.out.println();
		}
		
		System.out.println("DEAD!");
	}
	
	public static String takeDamage(int dmg, int amt)
	
	{
		if(dmg == 1)
		
		{
			healthCount -= amt;
			return  amt + " DAMAGE!";
		}
		
		else
		{
			if(healthCount + amt < HEALTHBAR)
			{
				healthCount += amt;
			}
			else
			{
				healthCount = HEALTHBAR;
			}
			return "Health gained " + amt + "!";
		}
	}
	public static void printClip()
	
	{
		String output = "Health: ";
		
		for(int i = 0; i < HEALTHBAR; i++)
		{
			if(i < healthCount)
			
			{
				health[i] = " [] ";
			}
			
			else
			{
				health[i] = "X";
			}
			output += health[i];
		}
		System.out.println(output);
	}
}