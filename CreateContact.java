package week2day1;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class CreateContact {
	public static void main(String[] args) {
		ChromeDriver driver=new ChromeDriver();
		driver.get("http://leaftaps.com/opentaps/control/main");
		driver.manage().window().maximize();
		driver.findElement(By.id("username")).sendKeys("demosalesmanager");
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		driver.findElement(By.className("decorativeSubmit")).click();
		System.out.println(driver.getTitle());
		driver.findElement(By.linkText("CRM/SFA")).click();
		driver.findElement(By.linkText("Contacts")).click();
		driver.findElement(By.linkText("Create Contact")).click();
		driver.findElement(By.id("firstNameField")).sendKeys("Sahana");
		driver.findElement(By.id("lastNameField")).sendKeys("Mohan");
		driver.findElement(By.className("smallSubmit")).click();
		System.out.println(driver.getTitle());
	  
	}
}
