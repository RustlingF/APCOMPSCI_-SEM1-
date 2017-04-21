public class Toyota extends TheCar
{
	public Toyota(String s)
	{
		String[] so = s.split(", ");
		l[0]=Double.parseDouble(so[0]);
		l[1]=Double.parseDouble(so[1]);
	}
}