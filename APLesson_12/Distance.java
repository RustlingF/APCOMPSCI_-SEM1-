import java.lang.Math.*;
public class Distance 
{
	private int xOne,yOne,xTwo,yTwo ; 
	private double distance ; 
	
	public Distance()
	{
		xOne = 0 ;
		yOne = 0 ;
		xTwo = 0 ;
		yTwo = 0 ;
		distance = 0 ;
	}
	public Distance(int XOne , int YOne, int XTwo, int YTwo)
	{
		xOne = XOne ; 
		yOne = YOne ; 
		xTwo = XTwo ; 
		yTwo = YTwo ; 
		distance = 0 ;
	}
	public void setValues(int XOne, int YOne,int XTwo, int YTwo)
	{
		xOne = XOne ; 
		yOne = YOne ; 
		xTwo = XTwo ; 
		yTwo = YTwo ; 
		distance = 0;
	}
	
	public int getXone()
	{
		return xOne; 
	}
	
	public int getYone()
	{
		return yOne;
	}
	
	public int getXtwo()
	{
		return xTwo ; 
	}
	
	public int getYtwo()
	{
		return yTwo;
	}
	
	public double getDist()
	{
		distance = Math.sqrt((xTwo-xOne)*(xTwo-xOne)+(yTwo-yOne)*(yTwo-yOne));
		return distance; 
	}
	

}