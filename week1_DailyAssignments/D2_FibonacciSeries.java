package week1_DailyAssignments;

public class D2_FibonacciSeries 
{

	public static void main(String[] args) 
	{

		int range =8, firstNum=0,secNum=1, sum;
		
		System.out.println("First Num is: "+ firstNum);
		
		for (int i=1;i<=8;i++)
		{
			sum = firstNum+secNum;
			firstNum=secNum;
			secNum=sum;
			
			System.out.println(sum);
		}

	}

}
