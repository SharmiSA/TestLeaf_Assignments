package week2_Day4Assignments;

import week2_Day3Assignments.MultipleLangauge;

public class Automation extends MultipleLangauge implements Language, TestTool
{

	public static void main(String[] args)
	{
		Automation a = new Automation();
		a.java();
		a.python();
		a.ruby();
		a.Selenium();
	}

	public void Selenium() 
	{
		System.out.println("Selenium Automation is an Open Source Tool");
	}

	
	public void java()
	{
		System.out.println("Java Supports Selenium Automation");

	}

	
	public void ruby() 
	{
		System.out.println("Ruby is also used to implement Selenium Automation");
		
	}
	public void python()
	{
		System.out.println("Python is blooming nowadays in Automation");
	}
}
