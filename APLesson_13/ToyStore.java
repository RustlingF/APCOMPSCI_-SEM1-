import java.util.ArrayList;
public class ToyStore
{
	ArrayList<Toy> toyList = new ArrayList<Toy>();
	
	public ToyStore()
	{
		toyList.add(new AFigure(""));
		toyList.add(new Car(""));
	}
	
	public ToyStore(String list)
	{
		loadToys(list);
	}
	
	public void loadToys(String list)
	{
		String[] toys = list.split(", ");
		
		for(int i=0;i<toys.length;i+=2)
		{
			String name = toys[i];
			String type = toys[i+1];
			
			if(getThatToy(name)==null)
			{
				if(type.equals("Car"))
					toyList.add(new Car(name));
				if(type.equals("AF"))
					toyList.add(new AFigure(name));
			}
			else
				getThatToy(name).setCount(1);
		}
	}
	
	public Toy getThatToy(String nm)
	{
		for(Toy toy: toyList)
		{
			if(toy.getName().equals(nm))
				return toy;
		}
		return null;
	}
	public String getMostFrequentToy()
	{
		String name="";
		int max=0;
		for(Toy toy: toyList)
		{
			if(max<toy.getCount())
			{
				max=toy.getCount();
				name=toy.getName();
			}	
		}
		return name;
	}
	
	public String getMostFrequentType()
	{
		int cars=0;
		int figures=0;
		
		for(Toy toy: toyList)
		{
			if(toy.getType().equals("Car"))
				figures+=1;
			if(toy.getType().equals("AF"))
				cars+=1;
		}
		if(cars>=figures)
			return "Cars";
		if(figures>=cars)
			return "Action Figures";
		else
			return "Equal amount of cars and action figures";
	}
	
	public String toString()
	{
		String toys="";
		for(Toy toy: toyList)
		{
			toys+=toy.getName()+" ";
			toys+=toy.getCount()+" ";
		}		
		return toys;		
	}
	
}