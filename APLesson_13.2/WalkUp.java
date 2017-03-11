public class WalkUp extends Ticket 
{	
	private int serialNo;
	private int daysLeft; 
	public WalkUp()
	{
		super();
	}
	public WalkUp(int DL)
	{
		super();
		daysLeft = DL;
	}
	public double getPrice()
	{
		return 50.00;
	}
	public String toString()
	{
		return super.toString()+"\n"; 
	}
}