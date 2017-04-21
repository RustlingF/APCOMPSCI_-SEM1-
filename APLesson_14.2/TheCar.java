public class TheCar implements Location
{
	double[] l;
	public final int id=(int)(Math.random() * (1000000-100000)+1) + 100000;
	
	public TheCar()
	{
		l = new double[2];
		l[0]=0;
		l[1]=0;
	}
	public int getID()
	{
		return id;
	}
	public void move(double xx,double yy)
	{
		l[0]+=xx;
		l[1]+=yy;
	}
	public double[] getLoc()
	{
		return l;
	}
}