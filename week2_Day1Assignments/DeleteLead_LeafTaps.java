package week2_Day1Assignments;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class DeleteLead_LeafTaps
{

	public static void main(String[] args)
	{
		EdgeDriver driver=new EdgeDriver();
		
		driver.manage().window().maximize();
		driver.get("http://leaftaps.com/opentaps/control/main");
		
		//driver.manage().timeouts().implicitlyWait("20");
		
		WebElement uname = driver.findElement(By.xpath("//input[@id='username']"));
		uname.sendKeys("demoSalesManager");
		
		driver.findElement(By.xpath("//input[@id='password']")).sendKeys("crmsfa");
		
		driver.findElement(By.xpath("//input[@value='Login']")).click();
		
		String title = driver.getTitle();
		System.out.println(title);
		
		if(title.contains("Leaftaps"))
		{
			System.out.println("We are in Right Page");
		}
		else
		{
			System.out.println("We are in Wrong Page");
		}
		
		WebElement crmsfaacc = driver.findElement(By.xpath("//img[@src='/opentaps_images/integratingweb/crm.png']"));
		crmsfaacc.click();
		
		WebElement leads = driver.findElement(By.xpath("//a[text()='Leads']"));
		leads.click();
		
		WebElement Findleadlink = driver.findElement(By.xpath("//a[text()='Find Leads']"));
		Findleadlink.click();
		
		WebElement phonelink = driver.findElement(By.xpath("//span[text()='Phone']"));
		phonelink.click();
		
//		WebElement phoneAreacode = driver.findElement(By.name("phoneAreaCode"));
//		phoneAreacode.sendKeys("1");
		
		WebElement phonenum = driver.findElement(By.name("phoneNumber"));
		phonenum.sendKeys("9176110707");
		
		WebElement Findleadbtn = driver.findElement(By.xpath("//button[text()='Find Leads']"));
		Findleadbtn.click();
		
		
	}

}
