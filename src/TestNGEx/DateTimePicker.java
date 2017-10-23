package TestNGEx;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

@Test
public class DateTimePicker 
{
	FirefoxDriver driver;
	@BeforeClass
	public void BC()
	{
		driver = new FirefoxDriver();
		driver.get("http://demo.guru99.com/selenium/");
	    driver.manage().window().maximize();
	    driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	}
	@Test
	public void dateandtimepicker()
	{
		WebElement datebox = driver.findElement(By.name("bdaytime"));
		datebox.sendKeys("06012016");
		datebox.sendKeys(Keys.TAB);
		datebox.sendKeys("0347PM");
		driver.findElement(By.xpath("//input[@type='submit']")).click();
	}
	
}
