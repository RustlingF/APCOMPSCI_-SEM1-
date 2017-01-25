import java.lang.Math.*;
public class MilesPerHour
{
	private int distance, hours, minutes; 
	private double mph ; 
	
	public MilesPerHour()
	{
		distance = 0; 
		hours = 0; 
		minutes = 0; 
		mph = 0 ;
	}
	
	public MilesPerHour(int distance1,int hours1,int minutes1)
	{
		distance = distance1;
		hours = hours1;
		minutes = minutes1;
		mph = 0;
	}
	
	public void setValues(int distance1, int hours1 , int minutes1)
	{
		distance = distance1;
		hours = hours1;
		minutes = minutes1;
		mph = 0;
	}
	
	public int getDistance()
	{
		return distance; 
	}
	
	public int getHours()
	{
		return hours;
	}
	
	public int getMinutes()
	{
		return minutes ; 
	}
	
	public double getMPH()
	{
		mph = Math.round(distance/(hours + minutes / 60.0)) ; 
		return mph ; 
	}
	
	
	
}