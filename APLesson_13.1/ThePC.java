public class ThePC extends TheGameSystem 
{
	private String platform; 
	private int serialNo;
	private String controller; 
	
	
	public ThePC()
	{
		super();
		controller = ""; 
	}
	public ThePC(String p,String c)
	{
		super(p);
		controller = c; 
		
	}
	
	public String getController()
	{
		return "Keyboard and Mouse"; 
	}
	public String getPlatform()
	{
		return "PC";
	}
	
	public String toString()
	{
		return "Platform:"+ platform+
				"Serial #:" +serialNo+
				"System Input:"+controller;
	}
	
}