public abstract class TheGameSystem
{
	private String platform; 
	private int serialNo;
 
	
	public TheGameSystem()
	{
		platform ="";
		serialNo = 1; 
	}
	
	public TheGameSystem(String p)
	{
		platform = p;
		serialNo =(int)(Math.random()*1000000); 
	}
	
	public String getPlatform()
	{
		return platform;
	}
	public abstract String getController();

	
	public int getSerialno()
	{
		return serialNo;
	}

}