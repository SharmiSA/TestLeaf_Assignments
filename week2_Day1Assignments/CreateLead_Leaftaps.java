package week2_Day1Assignments;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.Select;

public class CreateLead_Leaftaps
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
		
		WebElement Createleads = driver.findElement(By.xpath("//a[text()='Create Lead']"));
		Createleads.click();
		
		WebElement CompanyName = driver.findElement(By.id("createLeadForm_companyName"));
		CompanyName.sendKeys("TEST LEAF");
		
		WebElement FName = driver.findElement(By.id("createLeadForm_firstName"));
		FName.sendKeys("Sharmila");
		
		WebElement LName = driver.findElement(By.id("createLeadForm_lastName"));
		LName.sendKeys("Mathew");
		
		Select source = new Select(driver.findElement(By.id("createLeadForm_dataSourceId")));
		source.selectByVisibleText("Employee");
		
		Select markcamp = new Select(driver.findElement(By.id("createLeadForm_marketingCampaignId")));
		markcamp.selectByVisibleText("Pay Per Click Advertising");
		
		WebElement Owner = driver.findElement(By.id("createLeadForm_ownershipEnumId"));
		Select own = new Select(Owner);
		own.selectByIndex(5);
		
		Select country = new Select(driver.findElement(By.id("createLeadForm_generalCountryGeoId")));
		country.selectByVisibleText("India");
		
		WebElement EmailID = driver.findElement(By.id("createLeadForm_primaryEmail"));
		EmailID.sendKeys("christysharmila9@gmail.com");
		
		WebElement PhNo = driver.findElement(By.id("createLeadForm_primaryPhoneNumber"));
		PhNo.sendKeys("8939744423");
		
		WebElement CreateLeadSubmit = driver.findElement(By.name("submitButton"));
		CreateLeadSubmit.click();
		
		String Verifytitle = driver.getTitle();
		System.out.println(Verifytitle);
		
		driver.close();

	}

}
