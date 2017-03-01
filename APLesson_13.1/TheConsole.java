public abstract class TheConsole extends TheGameSystem
{
	public TheConsole()
	{
		super();
	}
	public TheConsole(String p)
	{
		super(p);
		
	}
	
	public abstract String getController();
	
	public String toString()
	{
		return super.toString()+ "\nController: " + getController();
	}
}