public class StudentAdvance extends Advance 
{
	private int serialNo;
	private int daysLeft;
	
	public StudentAdvance()
	{
		super();
	}
	public StudentAdvance(int DL)
	{
		super();
		daysLeft = DL;
	}
	public double getPrice()
	{
		return super.getPrice()/2;
	}
	public String toString()
	{
		return super.toString()+"\n" + "(Student ID REQUIRED)"; 
	}
}