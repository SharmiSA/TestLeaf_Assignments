package week2_Day2Assignments;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class DeleteLead
{

	public static void main(String[] args) throws InterruptedException 
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
		
		WebElement phonenum = driver.findElement(By.name("phoneNumber"));
		phonenum.sendKeys("9000235468");
		
		WebElement Findleadbtn = driver.findElement(By.xpath("//button[text()='Find Leads']"));
		Findleadbtn.click();
		
		Thread.sleep(3000);
		
		List<WebElement> firstoccID = driver.findElements(By.xpath("//div[@class='x-grid3-cell-inner x-grid3-col-partyId']//a"));
		System.out.println(firstoccID.size());
		
		for (int i=0;i<firstoccID.size();i++)
		{
			System.out.println(firstoccID.get(i).getText());
		}
			firstoccID.get(0).click();
			
		WebElement deletelead = driver.findElement(By.xpath("//a[text()='Delete']"));
		deletelead.click();
		
		WebElement Findleadlink1 = driver.findElement(By.xpath("//a[text()='Find Leads']"));
		Findleadlink1.click();
		
		WebElement validateLeadID = driver.findElement(By.xpath("//input[@name='id']"));
		validateLeadID.sendKeys("12232");
		
		WebElement Findleadbtn1 = driver.findElement(By.xpath("//button[text()='Find Leads']"));
		Findleadbtn1.click();
		
		Thread.sleep(3000);
		
		WebElement ErrMsg = driver.findElement(By.xpath("//div[text()='No records to display']"));
		System.out.println(ErrMsg.getText());
		
		driver.close();
	}

}
