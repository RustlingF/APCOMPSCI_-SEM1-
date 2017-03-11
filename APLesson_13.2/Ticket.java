public abstract class Ticket
{
	private int serialNo;
	
	public Ticket()
	{
		serialNo = (int)((Math.random()*10000000)); 
	}
	
	public int getSerialNo()
	{
		serialNo = (int)((Math.random()*10000000));
		
		return serialNo;
	}
	
	public abstract double getPrice();
	
	public String toString()
	{
		return "Serial# : " + serialNo +"\nPrice : "+ getPrice(); 
	}
	
}