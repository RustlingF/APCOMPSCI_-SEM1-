public class Xbox extends TheGameSystem 
{
	private String platform; 
	private int serialNo;
	private String controller; 
	
	
	public Xbox()
	{
		super();
		controller = ""; 
	}
	public Xbox(String p,String c)
	{
		super(p);
		controller = c; 
		
	}
	
	public String getController()
	{
		return "Xbox Wireless Controller"; 
	}
	public String getPlatform()
	{
		return "Xbox";
	}
	
}