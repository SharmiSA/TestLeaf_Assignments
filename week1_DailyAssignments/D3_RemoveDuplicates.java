package week1_DailyAssignments;

public class D3_RemoveDuplicates 
{

	public static void main(String[] args) 
	{
		String text = "We learn java basics as part of java sessions in java week1";
		
		String[] arraystring=text.split(" ");
		
		for(int i=0;i<arraystring.length;i++)
		{
			
		int j;
		
			for( j=i+1;j<arraystring.length;j++)
			{
				if(arraystring[i].equals(arraystring[j]))
				{
					System.out.println(arraystring[j]);

				}
				
			}
					
		}

	}

}
