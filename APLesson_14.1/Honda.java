public class Honda extends TheCar 
{
	private double Xcoor; 
	private double Ycoor;
	
	public Honda()
	{
		Xcoor = 0;
		Ycoor = 0;
	}
	public Honda(double[]honLoc)
	{
		Xcoor = 0;
		Ycoor = 0;
		move(honLoc[0],honLoc[1]);
	}
	public int getID()
	{
		return super.getID();
	}
	public void move(double X,double Y)
	{
		Xcoor+=X;
		Ycoor+=Y;
	}
	public double[] getLoc()
	{
		double[] location = new double[2];
		location[0] = Xcoor;
		location[1] = Ycoor;
		return location;
	}
}