public class TheUserClass
{
	static private String firstName;
	static private String lastName;
	static private String avatar;
	static private int userID;
	
	public TheUserClass()
	{
		firstName = "";
		lastName = "";
		avatar = "";
		userID = 0;
	}
	public TheUserClass(String firstN, String lastN)
	{
		firstName = firstN;
		lastName = lastN;
		avatar = "undefined";
		userID = (int)(Math.random() * 100000) + 1;
	}
	public TheUserClass(String firstN, String lastN, String avt)
	{
		firstName = firstN;
		lastName = lastN;
		avatar = avt;
		userID = (int)(Math.random() * 100000) + 1;
	}
	public void setValues(String firstN, String lastN, String avt)
	{
		firstName = firstN;
		lastName = lastN;
		avatar = avt;
		userID = (int)(Math.random() * 1000000) + 1;
	}
	public String toString()
	{
		return "Customer Info : \nFirst Name: " + firstName + 
								"\nLast Name: " + lastName + 
								"\nAvatar: " + avatar + 
								"\nUser ID#: " + userID;
	}
}