package TestNGEx;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeGroups;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class HRMApplyLeave
{
	WebDriver driver;
	@BeforeClass
	public void LoginHRM()
	{
		driver = new FirefoxDriver();
		driver.get("http://testingmasters.com/hrm/");
	    driver.manage().window().maximize();
	    driver.findElement(By.id("txtUsername")).sendKeys("user01");
	    driver.findElement(By.id("txtPassword")).sendKeys("pass1234");
	    driver.findElement(By.id("btnLogin")).click();
	}
	@BeforeSuite
	public void BS()
		{
			System.out.println("Before suite executed");
		}
	@BeforeTest
		public void BT()
		{
			System.out.println("Before test executed");
		}
	
	@Test
	public void PersonalLeave()
	{
		System.out.println("Apply personalleave code");
	}
	@Test
	public void AnnualLeave()
	{
		System.out.println("Apply Annualleave code");
	}
	@AfterClass
	public void LogoutHRM()
	{
		driver.quit();
	}
}
