public class ThePC extends TheGameSystem 
{
	public ThePC()
	{
		super();
	}
	public ThePC(String p)
	{
		super(p);		
	}
	public String getPlatform()
	{
		return "PC";
	}
	public String systemInput()
	{
		return "Keyboard and Mouse"; 
	}
	
	public String toString()
	{
		return  "Platform: "+getPlatform()+"\n SerialNo#: "+ getSerialno()+"\nController: " + systemInput();
	}
	
}