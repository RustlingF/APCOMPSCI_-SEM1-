public class PlayStation extends TheGameSystem 
{
	private String platform; 
	private int serialNo;
	private String controller; 
	
	
	public PlayStation()
	{
		super();
		controller = ""; 
	}
	public PlayStation(String p,String c)
	{
		super(p);
		controller = c; 
		
	}
	
	public String getController()
	{
		return "PS DualShock 4"; 
	}
	public String getPlatform()
	{
		return "PlayStation";
	}
	
}