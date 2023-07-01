package week2day1;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class LaunchBrowser {
	public static void main(String[] args) {
		ChromeDriver driver=new ChromeDriver();
		driver.get("http://leaftaps.com/opentaps/control/main");
		driver.manage().window().maximize();
		driver.findElement(By.id("username")).sendKeys("demosalesmanager");
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		driver.findElement(By.className("decorativeSubmit")).click();
		System.out.println(driver.getTitle());
		driver.findElement(By.linkText("CRM/SFA")).click();
		driver.findElement(By.linkText("Leads")).click();
		driver.findElement(By.linkText("Create Lead")).click();
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys("AgriFarm");
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys("Sahana");
		driver.findElement(By.id("createLeadForm_lastName")).sendKeys("Mohan");
		driver.findElement(By.id("createLeadForm_firstNameLocal")).sendKeys("sahana");
		driver.findElement(By.id("createLeadForm_departmentName")).sendKeys("marketing");
		driver.findElement(By.id("createLeadForm_description")).sendKeys("For sales");
		driver.findElement(By.id("createLeadForm_primaryEmail")).sendKeys("msahana26@gmail.com");
		driver.findElement(By.className("smallSubmit")).click();
		System.out.println(driver.getTitle());
		
		}

}
