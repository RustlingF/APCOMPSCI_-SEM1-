public class PlayStation extends TheGameSystem 
{
	public PlayStation()
	{
		super();
	}
	public PlayStation(String p)
	{
		super(p);
	
		
	}
	public String getPlatform()
	{
		return "Playstation";
	}
	public String getController()
	{
		return "PS DualShock 4"; 
	}
	public String toString()
	{
		return  "Platform: "+getPlatform()+ super.toString()+"\nController: " + getController();
	}
}