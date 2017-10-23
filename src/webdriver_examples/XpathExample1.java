package webdriver_examples;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class XpathExample1 
{
	public static void main(String[] args)
	{
		WebDriver driver = new FirefoxDriver();
		driver.get("http://testingmasters.com/hrm");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		//HRM Login page code
		driver.findElement(By.id("txtUsername")).sendKeys("user01");
		driver.findElement(By.id("txtPassword")).sendKeys("pass1234");
		driver.findElement(By.id("btnLogin")).click();
		if(driver.findElement(By.xpath("//h1[(text()='Dashboard')]")).isDisplayed())//xpath=//h1[contains(text(),'Dashboard')]
		{
			System.out.println("dashaboard page is displayed");
		}
		else
		{
			System.out.println("dashaboard page is not displayed");
		}
	}
}
