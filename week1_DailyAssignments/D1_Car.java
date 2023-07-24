package week1_DailyAssignments;

public class D1_Car 
{
	public void driveCar()
	{
		System.out.println("Drive a Car");
	}
	
	public void applyBrake()
	{
		System.out.println("Apply Brake");
	}
	
	public void soundHorn()
	{
		System.out.println("Sound Horn");
	}
	
	public void isPuncture()
	{
		System.out.println("Check if Puncture");
	}
	
	public static void main(String[] args)
	{
		
		D1_Car c = new D1_Car();
		c.driveCar();
		c.applyBrake();
		c.soundHorn();
		c.isPuncture();
		
	}

}
