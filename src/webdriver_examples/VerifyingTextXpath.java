package webdriver_examples;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class VerifyingTextXpath {

	public static void main(String[] args) throws InterruptedException 
	{
		//EXAMPLE-2
		WebDriver driver = new FirefoxDriver();
		driver.get("http://www.testingmasters.com/hrm/");
		//click login without entering username and password
		driver.findElement(By.id("btnLogin")).click();
		Thread.sleep(2000);
		try
		{
			driver.findElement(By.xpath("//span[contains(text(), 'Username cannot be empty')]"));
			System.out.println("expected msz exist");
		}
		catch(Exception e)
		{
			System.out.println("expected msz not exists");
		}
		
	}

}
