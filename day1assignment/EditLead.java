package week2.day1assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class EditLead {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ChromeDriver Driver = new ChromeDriver();
		Driver.get("http://leaftaps.com/opentaps/control/login");
		Driver.findElement(By.id("username")).sendKeys("Demosalesmanager");
		Driver.findElement(By.id("password")).sendKeys("crmsfa");
		Driver.findElement(By.className("decorativeSubmit")).click();
		Driver.findElement(By.linkText("CRM/SFA")).click();
		Driver.findElement(By.linkText("Leads")).click();
		Driver.findElement(By.linkText("Create Lead")).click();
		Driver.findElement(By.id("createLeadForm_companyName")).sendKeys("Wipro Limited");
		Driver.findElement(By.id("createLeadForm_firstName")).sendKeys("Balaji ");
		Driver.findElement(By.id("createLeadForm_lastName")).sendKeys("L");
		Driver.findElement(By.id("createLeadForm_firstNameLocal")).sendKeys("Bala");
		Driver.findElement(By.name("departmentName")).sendKeys("Technology");
		Driver.findElement(By.name("description")).sendKeys("Selenium");
		Driver.findElement(By.name("primaryEmail")).sendKeys("bala.13917@gmail.com");
		WebElement State = Driver.findElement(By.id("createLeadForm_generalStateProvinceGeoId"));
		Select  fstate = new Select(State);
		fstate.selectByVisibleText("New York");
		Driver.findElement(By.name("submitButton")).click();
		Driver.findElement(By.linkText("Edit")).click();
		Driver.findElement(By.name("description")).clear();
		Driver.findElement(By.name("importantNote")).sendKeys("Selenium version 4");
		Driver.findElement(By.name("submitButton")).click();
		String title = Driver.getTitle();
		System.out.println(title);
		
		
		
		

	}

}
