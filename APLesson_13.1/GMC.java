public class GMC implements Location 
{
	private double Xcoor;
	private double Ycoor;
	
	public GMC(double x1,double y1)
	{
		Xcoor = x1;
		Ycoor = y1;
	}
	public int getID()
	{
		return (int)(Math.random() * (1000000-100000)+1) + 100000;
	}
	public void move(double xx,double yy)
	{
		Xcoor+=xx;
		Ycoor+=yy;
	}
	public double[] getLoc()
	{
		double[] l = new double[2];
		l[0]=Ycoor;
		l[1]=Xcoor;
		return l;
	}
}