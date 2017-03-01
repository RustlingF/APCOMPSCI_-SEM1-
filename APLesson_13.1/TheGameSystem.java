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
		serialNo =(int)((Math.random()*10000000)); 
	}
	
	public String getPlatform()
	{
		return platform;
	}

	
	public int getSerialno()
	{
		return serialNo;
	}
	public String toString()
	{
		return  "\n" + "Serial #: " + serialNo;
	}
	

}