public abstract class TheGameSystem
{
	private String platform; 
	private int serialNo;
 
	
	public TheGameSystem()
	{
		platform ="";
	}
	
	public TheGameSystem(String p)
	{
		platform = p; 
	}
	
	public String getPlatform()
	{
		return platform;
	}

	
	public int getSerialno()
	{
		serialNo =(int)(Math.random()*10000000);
		return serialNo ;
	}
	

}