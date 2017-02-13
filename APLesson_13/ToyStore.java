import java.util.Scanner; 
import java.util.ArrayList; 
public class ToyStore 
{
	private Arraylist<Toy> toyList;
	
		public ToyStore()
		{
			ArrayList<Toy> toyList = new ArrayList <Toy>(); 
		}
		public ToyStore(String ts)
		{
			ArrayList<Toy> toyList = new ArrayList<Toy>();
			loadToys(ts); 
		}
	
	public void loadToys(String ts)
	{
		String[] toys = ts.split(", ");
		for(int i=0;i<toys.length;i++)
		{
			String name=toys[i];
			String type=toys[i+1];
			
			if(getThatToys(name)==null)
			{
				if(type.equals("car"))
					toyList.add(new Car(name));
				if(type.equals("afigure"))
					toyList.add(new AFigure(name));
			}
			else
			{
				getThatToys(name).setCount(1);
			}
		}
	}
	
	public String getThatToys(String nm)
	{
		for(Toy toy: toyList)
		{
			if(name == nm)
			{
				return Toys ; 
			}
			
			else
			{
				return null ;
			}
		}
	}
	
	public String getMostFrequentToy()
	{
		String name = "";
		int max = Integer.MIN_VALUE;
		
		for(Toy toy:toyList)
		{
			if(max < count)
				max = Toy.getCount;
				name = Toy.getName;
		}
		return
			name;
	
	
	}
	
	public String getMostFrequentType()
	{
		int cars = 0 ;
		int figures = 0 ;
		
		for(Toy toy:toyList)
		{
			if(Toy == Car)
			{
				cars+=1;
			}
			if(Toy == AFigure)
			{
				figures += 1 ;
			}
		}
		if(cars > figures)
		{
			return cars;
		}
		if(figures > cars)
		{	
			return figures;
		}
		else
		{
			return "Equal amounts of action figures and cars!"; 
		}
	}
	public String toString()
	{
		return toyList;
	}
	
}