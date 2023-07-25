package week2.Day1Assignments;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class FindAccount 
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
		
		WebElement crmsfaacc = driver.findElement(By.xpath("//img[@src='/opentaps_images/integratingweb/crm.png']"));
		crmsfaacc.click();
		
		WebElement Account = driver.findElement(By.xpath("//a[text()='Accounts']"));
		Account.click();
		
		WebElement FindAccountlink = driver.findElement(By.xpath("//a[text()='Find Accounts']"));
		FindAccountlink.click();
		
		WebElement FindAccByName = driver.findElement(By.xpath("(//input[@name='accountName'])[2]"));
		FindAccByName.sendKeys("Credit Limited Account");
		
		WebElement FindAccountbtn = driver.findElement(By.xpath("//button[text()='Find Accounts']"));
		FindAccountbtn.click();
		
		WebElement CreditltdAcc = driver.findElement(By.partialLinkText("Credit"));
		CreditltdAcc.click();
		
		WebElement EditAcc = driver.findElement(By.xpath("//a[text()='Edit']"));
		EditAcc.click();
		
		//Used to getText
		
		String accountName=driver.findElement(By.id("accountName")).getAttribute("value");
		System.out.println(accountName);
		
		String description=driver.findElement(By.name("description")).getAttribute("value");
		System.out.println(description);
		
		System.out.println("Title: "+driver.getTitle());
		
		driver.close();
	}

}
