package week2_Day2Assignments;

import org.openqa.selenium.By;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.Select;

public class CreateContact 
{

	public static void main(String[] args)
	{
		EdgeDriver driver=new EdgeDriver();
		
		driver.manage().window().maximize();
		driver.get("http://leaftaps.com/opentaps/control/main");
		
		//driver.manage().timeouts().implicitlyWait("20");
		
		driver.findElement(By.xpath("//input[@id='username']")).sendKeys("demoSalesManager");
		driver.findElement(By.xpath("//input[@id='password']")).sendKeys("crmsfa");
		driver.findElement(By.xpath("//input[@value='Login']")).click();
		driver.findElement(By.xpath("//img[@src='/opentaps_images/integratingweb/crm.png']")).click();
		driver.findElement(By.xpath("//a[text()='Contacts']")).click();
		driver.findElement(By.xpath("//a[text()='Create Contact']")).click();
		driver.findElement(By.id("firstNameField")).sendKeys("Sharmila Mathew");
		driver.findElement(By.id("lastNameField")).sendKeys(" Alex");
		driver.findElement(By.id("createContactForm_firstNameLocal")).sendKeys("Sharmi");
		driver.findElement(By.id("createContactForm_lastNameLocal")).sendKeys("Matty");
		driver.findElement(By.id("createContactForm_departmentName")).sendKeys("BCA");
		driver.findElement(By.id("createContactForm_description")).sendKeys("BCA MS");
		driver.findElement(By.id("createContactForm_primaryEmail")).sendKeys("smahalakshmi079@gmail.com");
		
		Select s = new Select(driver.findElement(By.id("createContactForm_generalStateProvinceGeoId")));
		s.selectByValue("AL");
		
		driver.findElement(By.xpath("//input[@value='Create Contact']")).click();
		driver.findElement(By.xpath("//a[text()='Edit']")).click();
		driver.findElement(By.id("updateContactForm_description")).clear();
		driver.findElement(By.id("updateContactForm_importantNote")).sendKeys("Testing");
		driver.findElement(By.xpath("//input[@value='Update']")).click();
		
		System.out.println(driver.getTitle());
		driver.close();
	}

}
