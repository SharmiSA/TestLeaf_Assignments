package week1_DailyAssignments;
import java.util.Arrays;

public class D3_MissingElementInAnArray 
{

	public static void main(String[] args) 
	{

		int[] arr = {1,2,3,4,7,6,8};
		int b=0;
		Arrays.sort(arr);
		
		for (int i=1;i<arr[arr.length-1];i++)
		{
			if(i==arr[b])
			{
				b++;
				
			}
			else
			{
				System.out.println(i);
			}

	}

}
}