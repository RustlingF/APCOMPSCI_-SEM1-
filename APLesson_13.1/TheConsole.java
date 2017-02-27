public class TheConsole extends TheGameSystem
{
	private String platform; 
	private int serialNo;
	private String controller; 
	
	
	public TheConsole()
	{
		super();
		controller = ""; 
	}
	public TheConsole(String p,String c)
	{
		super(p);
		controller = c; 
		
	}
	
	public String getController()
	{
		return controller; 
	}
	
	
	public String toString()
	{
		return "Platform:"+ platform+
				"Serial #:" +serialNo+
				"Controller:"+controller;
	}
}
