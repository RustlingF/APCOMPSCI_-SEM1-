import java.util.ArrayList;
public class Toyota implements Location 
{
	private double Xcoor;
	private double Ycoor;
	
	public Toyota(String s)
	{
		String[] so = s.split(", ");
		ArrayList<Integer> t = new ArrayList<Integer>();
		for(int i = 0; i < so.length; i++)
		{
			t.add(Integer.parseInt(so[i]));
		}
		Xcoor=t.get(0);
		Ycoor=t.get(1);
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
		l[0]=Xcoor;
		l[1]=Ycoor;
		return l;
	}
}
