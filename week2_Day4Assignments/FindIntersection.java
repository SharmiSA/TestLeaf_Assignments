package week2_Day4Assignments;

import java.util.ArrayList;
import java.util.List;

public class FindIntersection 
{

	public static void main(String[] args) 
	{
		int[] a={3,2,11,4,6,7};
		int[] b={1,2,8,4,9,7};
		
		List<Integer> li = new ArrayList<Integer>();
		List<Integer> li1 = new ArrayList<Integer>();
		
		for (int i=0;i<a.length;i++)
		{
			li.add(a[i]);
		}
		System.out.println(li);
		
		for (int j=0;j<b.length;j++)
		{
			li.add(b[j]);
		}
		System.out.println(li1);
		
		 for (int i=0;i<li.size();i++)
	        {
	        	for (int j=0;j<li1.size();j++)
	        	{
	        		if (li.get(i)==li1.get(j))
	        		{
	        			System.out.println(li.get(i));
	        		}
	        	}
	        }

	}

}
