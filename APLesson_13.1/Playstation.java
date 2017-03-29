public class Playstation extends TheGameSystem 
{
	public Playstation()
	{
		super();
	}
	public Playstation(String p)
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
		return  "Platform: "+getPlatform()+"\n SerialNo#: "+ getSerialno()+"\nController: " + getController();
	}
}