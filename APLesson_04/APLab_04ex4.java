import java.util.Scanner; //import Statment 

public class APLab_04ex4
{
	public static void main(String []args)
	{
		APLab_04ex4 volume = new APLab_04ex4(); 
		
		Scanner keyboard  = new Scanner(System.in);
		
		System.out.print("Enter height in inches: ");
		double height = keyboard.nextDouble();
		
		System.out.println("Enter length in inches: ");
		double length = keyboard.nextDouble();
		
		System.out.println("Enter width in inches: ");
		double width = keyboard.nextDouble();
		
		double totalvol = volume.calcVol(height,length,width);
		System.out.printf("Your measurment in feet is  \n %10.2f ", totalvol);
		
		
	}
	
	public double calcVol(double height, double length, double width)
	{
		return ((height*length*width)/1728);
		
	}
	
}