public class GMC extends TheCar 
{
	private double Xcoor; 
	private double Ycoor;
	
	public GMC()
	{
		Xcoor = 0;
		Ycoor = 0;
	}
	public GMC(double X, double Y)
	{
		Xcoor = X;
		Ycoor = Y;
		move(X,Y);
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