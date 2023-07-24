package week1_DailyAssignments;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class D4_EditLeadAcc
{
	public static void main(String[] args) 
	{
		ChromeDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.get("http://leaftaps.com/opentaps/control/main");
		
		//driver.manage().timeouts().implicitlyWait("20");
		
		WebElement uname = driver.findElement(By.id("username"));
		uname.sendKeys("demoSalesManager");
		
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		
		driver.findElement(By.className("decorativeSubmit")).click();
		
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
		
		WebElement EmailID = driver.findElement(By.id("createLeadForm_primaryEmail"));
		EmailID.sendKeys("christysharmila9@gmail.com");
		
		WebElement PhNo = driver.findElement(By.id("createLeadForm_primaryPhoneNumber"));
		PhNo.sendKeys("8939744423");
		
		WebElement CreateLeadSubmit = driver.findElement(By.name("submitButton"));
		CreateLeadSubmit.click();
		
		WebElement Edit = driver.findElement(By.xpath("//a[text()='Edit']"));
		Edit.click();
		
		WebElement chngCompanyName = driver.findElement(By.id("updateLeadForm_companyName"));
		chngCompanyName.clear();
		
		chngCompanyName.sendKeys("TESTLEAF INS");
		
		WebElement Update = driver.findElement(By.name("submitButton"));
		Update.click();
		
	}

}
