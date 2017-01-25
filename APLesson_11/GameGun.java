import java.util.Scanner;

public class GameGun
{
	static int BulletCount, ShotCount;
	static int Clipsize = 16;
	static String[] clip;
	
	public static void main(String[]args)
	
	{
		
		Scanner kb = new Scanner(System.in);
		
		BulletCount = 96;
		ShotCount = 0;
		clip = new String[Clipsize];
		resetClip();
		
		while(BulletCount > 0 || ShotCount > 0)
		
		{
			System.out.print("ACTION: ");
			
			String action = kb.next();
			
			if(action.equals("R"))
			{
				reload();
			
			}
			if(action.equals("S"))
			{
				System.out.println(shoot());
			}
			
			printClip();
			
			System.out.println();
		}
		System.out.println("Out of bullets :( ");
	}
	public static void resetClip()
	
	{
		for(int i = 0; i < clip.length; i++)
		
		{
			clip[i] = "[ ]";
		}
	}
	
	public static String shoot()
	
	{
		if(ShotCount > 0)
		
		{
			clip[ShotCount - 1] = "[ ]";
			ShotCount--;
			return "Bang!!";
		
		}
		
		else
		{
			return "Reload!!";
		}
		
		
	}
	public static void reload()
	{
		if(BulletCount >= Clipsize)
		{
			BulletCount -= Clipsize;
			ShotCount = Clipsize;
		}
		else
		{
			ShotCount = BulletCount;
			BulletCount = 0;
		}
		for(int i = 0; i < ShotCount; i++)
		{
			clip[i] = "*";
		}
	}
	public static void printClip()
	{
		String output = "";
		output += "Bullets: " + BulletCount + "\nClip: ";
		for(int i = 0; i < Clipsize; i++)
		{
			output += clip[i];
		}
		System.out.println(output);
		
	}
}