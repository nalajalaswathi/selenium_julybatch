package TestNGEx;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataProviderEx 
{
	WebDriver driver;
	@BeforeClass
	public void launchapp()
	{	
		    driver = new FirefoxDriver();
			driver.get("https://www.google.co.in");
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	}
	@Test(dataProvider="googlesearch")
	public void searchmethod(String author,String searchKey) throws InterruptedException
	{
		WebElement searchtext = driver.findElement(By.name("q"));
		searchtext.sendKeys(searchKey);
		System.out.println("Welcome ->"+author+" Your search key is->"+searchKey);
		Thread.sleep(3000);
		String testvalue = searchtext.getAttribute("value");
		System.out.println(testvalue + "::::::" + searchKey );
		searchtext.clear();
		Assert.assertTrue(testvalue.equalsIgnoreCase(searchKey));
	}
	@DataProvider(name="googlesearch")
	public Object[][] getDataFromDataprovider()
	{
		return new Object[][]{
			{"tmasters1","india"},
			{"tmasters2","us"},
			{"tmasters3","uk"}
			
		};
	}
}
