public class Xbox extends TheGameSystem 
{	
	
	public Xbox()
	{
		super();
	}
	public Xbox(String p)
	{
		super(p);
	
		
	}
	public String getPlatform()
	{
		return "Xbox";
	}
	
	public String getController()
	{
		return "Xbox Wireless Controller"; 
	}
	
	public String toString()
	{
		return  "Platform: "+getPlatform()+ super.toString()+"\nController: " + getController();
	}
	
}