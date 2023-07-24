package week1_DailyAssignments;

import java.util.Arrays;

public class D3_FindSecondLargest 
{

	public static void main(String[] args)
	{
		int[] data = {3,12,11,4,6,7};
		Arrays.sort(data);
		
		
		int length=data.length;
		System.out.println((data[length-2]));
		
	}

}
