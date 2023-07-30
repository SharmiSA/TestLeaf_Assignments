package week2_Day3Assignments;

class BankInfo
{
	public void savings()
	{
		System.out.println("Savings");
	}
	
	public void fixed()
	{
		System.out.println("Fixed");
	}
	
	public void deposit()
	{
		System.out.println("Deposit");
	}
}

class AxisBank extends BankInfo
{
	public void deposit()
	{
		System.out.println("Deposit in Axis Bank");
	}
}
public class Override 
{

	public static void main(String[] args)
	{
		AxisBank a = new AxisBank();
		a.deposit();
		a.savings();
		a.fixed();
	}

}
