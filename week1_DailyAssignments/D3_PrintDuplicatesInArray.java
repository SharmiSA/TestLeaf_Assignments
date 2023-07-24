package week1_DailyAssignments;

public class D3_PrintDuplicatesInArray 
{

	public static void main(String[] args) 
	{
		int[] arr = {14,12,11,15,14,18,16,17,19,18,17,20};
		
		System.out.println("Length of an Array is: " +  arr.length);
		
		System.out.println();
		
		System.out.println("Duplicate Element in an Array:");
		int	count;
		
		for(int i=0;i<arr.length-1;i++)
		{
			count =0;
			
			for(int j=0;j<i;j++)
			{
				
				if(arr[i]==arr[j])
					System.out.println(arr[j]);
				{
					
				}
			}	
		}
		

	}

}
