import java.util.Random;

public class APLab_05ex_01
{
	static int playerRoll;
	static int compRoll;
	static String winner;
	
	public static void main(String[]args)
	{
		playerRoll = (int)(Math.random()*7)+1;
		compRoll = (int)(Math.random()*7)+1;
		
		rollDice();
		System.out.println("You rolled a "+playerRoll);
		System.out.println("Computer rolled a "+ compRoll);
		System.out.println("Winner is "+winner);
		
	}
	
	public static void rollDice()
	{
		
		if (playerRoll > compRoll)
			winner = "Player";
		if (compRoll > playerRoll)
			winner = "Computer";
		
	}
}
		