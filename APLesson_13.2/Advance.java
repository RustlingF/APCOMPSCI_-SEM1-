public class Advance extends Ticket 
{
	private int daysLeft; 
	
	public Advance()
	{
		super();
	}
	public Advance(int DL)
	{
		super();
		daysLeft = DL;
	}
	public double getPrice()
	{
		if (daysLeft >= 10)
		{
			return 30.00;
		}
		else 
		{
			return 40.00;
		}
	}
	
}
