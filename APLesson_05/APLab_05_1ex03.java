import java.util.Scanner;

public class APLab_05_1ex03
{
	public static void main(String[]args)
	{
		
		Scanner kb = new Scanner(System.in); 
		
		System.out.println("Enter first grade: ");
		String grade1 = kb.nextLine();
		
		System.out.println("Enter second grade: ");
		String grade2 = kb.nextLine();
		
		System.out.println("Enter third grade: ");
		String grade3 = kb.nextLine();
		
		System.out.println("Enter fourth grade: ");
		String grade4 = kb.nextLine();
		
		System.out.println("Enter fith grade: ");
		String grade5 = kb.nextLine();
		
		System.out.println("Enter sixth grade: ");
		String grade6 = kb.nextLine();
		
		System.out.println("Enter seventh grade: ");
		String grade7 = kb.nextLine();
		
		 
		
		double gpoints = calcPoints(grade1)+calcPoints(grade2)+calcPoints(grade3)+calcPoints(grade4)+calcPoints(grade5)+calcPoints(grade6)+calcPoints(grade7);
		double GPA = gpoints/7;
		
		System.out.printf("Your GPA is %.2f",GPA);
	}
	
	public static double calcPoints(String grade)
	{
		if(grade.equals("A"))
			return 4.0 ;
		
		if(grade.equals("B"))
			return 3.0 ;
		if(grade.equals("C"))
			return 2.0 ;
		if(grade.equals("D"))
			return 1.0;
		else
			return 0.0;
	}
}