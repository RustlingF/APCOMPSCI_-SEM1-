public class Car extends Toy
{
	public Car()
	{
		super();
	}
	
	public Car(String n)
	{
		super(n);
	}
	
	public String getType()
	{
		return "car";
	}
	
	public String toString()
	{
		return super.toString();
	}
}