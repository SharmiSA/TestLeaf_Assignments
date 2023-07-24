package week1_DailyAssignments;

public class D3_ChangeOddIndexToUpperCase 
{

	public static void main(String[] args) 
	{
		
		String test = "changeme";
		
		char[] ch = test.toCharArray();
		
		//System.out.println(ch);
		
		int length=ch.length;
		
		System.out.println("Length of my String is: " + length);
		
		System.out.println("Given String is : "+" "+test);
		
		String lc = test.toLowerCase();
		String uc = test.toUpperCase();
		
		for(int i=0;i<length;i++) 
		{
		if(i%2==0)	
		{
		char lowercase = lc.charAt(i);	
		System.out.print(lowercase);
		}
		else {
			char uppercase = uc.charAt(i);
			System.out.print(uppercase);
		}
		}
		
		
		}
		

	

}
