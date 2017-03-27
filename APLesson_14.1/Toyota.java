import java.util.ArrayList;
public class Toyota extends TheCar 
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
		return super.getID();
	}
	public void move(double xx,double yy)
	{
		Xcoor+=xx;
		Ycoor+=yy;
	}
	public double[] getLoc()
	{
		double[] location = new double[2];
		location[0] = Xcoor;
		location[1] = Ycoor;
		return location;
	}

}