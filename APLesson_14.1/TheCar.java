public abstract class TheCar implements Location 
{
	private double Xcoor; 
	private double Ycoor;
	
	public TheCar()
	{
		Xcoor = 0;
		Ycoor = 0;
	}
	public TheCar(double X, double Y)
	{
		Xcoor = X;
		Ycoor = Y;
		move(X,Y);
	}
	public int getID()
	{
		return (int)(Math.random()*10000000);
	}
	public void move(double X,double Y)
	{
		Xcoor = X;
		Ycoor = Y;
	}
	public double[] getLoc()
	{
		double[] location = new double[2];
		location[0] = Xcoor;
		location[1] = Ycoor;
		return location;
	}
}