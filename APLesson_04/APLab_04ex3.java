import java.util.Scanner; //import Statment 

public class APLab_04ex3
{
	public static void main(String []args)
	{
		APLab_04ex3 interest = new APLab_04ex3(); 
		
		Scanner keyboard  = new Scanner(System.in);
		
		System.out.print("Enter intrest rate: ");
		double rate = keyboard.nextDouble();
		
		System.out.println("Enter intrest principle: ");
		double prince = keyboard.nextDouble();
		
		System.out.println("Enter number of times the loan is compounded per year: ");
		double cmpd = keyboard.nextDouble();
		
		System.out.println("Enter life of loan((in years)): ");
		double loan = keyboard.nextDouble();
		
		double totalpay = interest.Total_pay(rate,prince,cmpd,loan);
		System.out.printf("Your monthly payment will be \n %10.2f ", totalpay);
		
		
	}
	
	public double Total_pay(double rate, double prince, double cmpd, double loan )
	{
		return (prince*Math.pow(1+rate/cmpd, cmpd*loan))/(loan*12);
		
	}
	
	
	
}