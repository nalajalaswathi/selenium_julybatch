package webdriver_examples;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class debugging 
{
	@Test
	public void testscript()
	{
		   WebDriver driver = new FirefoxDriver();
		   driver.get("https://www.facebook.com/");
		   driver.findElement(By.xpath("//input[@id='email']")).sendKeys("Testing");
		   driver.findElement(By.xpath("//input[@id='pass']")).sendKeys("12345678");
		   driver.findElement(By.xpath("//input[@id='u_0_2']"));
	}
}
