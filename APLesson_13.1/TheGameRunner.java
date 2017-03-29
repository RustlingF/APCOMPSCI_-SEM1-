public class TheGameRunner
{
	public static void main(String[]args)
	{
		Playstation ps4 = new Playstation("");
		System.out.println(ps4);
		System.out.println();
		
		Xbox xbox = new Xbox("");
		System.out.println(xbox);
		System.out.println();
		
		ThePC pc = new ThePC("PC");
		System.out.println(pc);
	}
}