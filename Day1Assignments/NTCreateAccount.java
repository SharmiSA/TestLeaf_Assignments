package week2.Day1Assignments;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.Select;

public class NTCreateAccount 
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
		
		WebElement CreateAccount = driver.findElement(By.xpath("//a[text()='Create Account']"));
		CreateAccount.click();
		
		WebElement Currency = driver.findElement(By.id("currencyUomId"));
		
		Select c = new Select(Currency);
		c.selectByValue("INR");
		
		WebElement LocalName = driver.findElement(By.xpath("//input[@id='groupNameLocal']"));
		LocalName.sendKeys("DebitAccount localName");
		
		WebElement SiteName = driver.findElement(By.xpath("//input[@id='officeSiteName']"));
		SiteName.sendKeys("DebitAccount SiteName");
		
		WebElement AnnRev = driver.findElement(By.xpath("(//input[@class='inputBox'])[5]"));
		AnnRev.sendKeys("10000");
		
		Select industry = new Select(driver.findElement(By.name("industryEnumId")));
		industry.selectByValue("IND_SOFTWARE");
		
		WebElement Owner = driver.findElement(By.name("ownershipEnumId"));
		Select own = new Select(Owner);
		own.selectByIndex(4);
		
		Select source = new Select(driver.findElement(By.name("dataSourceId")));
		source.selectByValue("LEAD_EMPLOYEE");
		
		Select markcamp = new Select(driver.findElement(By.name("marketingCampaignId")));
		markcamp.selectByIndex(6);
		
		WebElement Desc = driver.findElement(By.xpath("//textarea[@name='description']"));
		Desc.sendKeys("NRI Account");
		
		Select State = new Select(driver.findElement(By.id("generalStateProvinceGeoId")));
		State.selectByValue("TX");
		
		WebElement CreateAccLink = driver.findElement(By.xpath("//input[@value='Create Account']"));
		CreateAccLink.click();
		
		//ErrorMsg
		System.out.println(driver.findElement(By.xpath("//div[text()='The Following Errors Occurred:']")).getText());
		//ErrorMsg1
		System.out.println(driver.findElement(By.xpath("//li[text()='The following required parameter is missing: [crmsfa.createAccount.accountName]']")).getText());
		
		driver.close();
	}

}
