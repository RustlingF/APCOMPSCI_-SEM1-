
import java.util.ArrayList; 
public class ToyStore 
{
	ArrayList<toy> toyList = new ArrayList<toy>();
	
	public Toy1s()
	{
		toyList.add(new Car(""));
		toyList.add(new AFigure(""));
	}
	public Toy1s(String list)
	{
		loadToys(list)
	}
	
	public loadToys(String ts)
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
	
	public getThatToys(String nm)
	{
		for(Toy:toyList)
	}
	
	
}