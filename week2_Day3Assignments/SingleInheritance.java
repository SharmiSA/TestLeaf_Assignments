package week2_Day3Assignments;


class Computer
{
	public void computerModel()
	{
		System.out.println("Single Inheritance: Computer Model");
	}
}

class Desktop extends Computer
{
	public void desktopSize()
	{
		System.out.println("Single Inheritance: Desktop Size");
	}
}
	

public class SingleInheritance
{

	public static void main(String[] args)
	{
		Desktop d = new Desktop();
		d.desktopSize();
		d.computerModel();
		
		
	}

}
