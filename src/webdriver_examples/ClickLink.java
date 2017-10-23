package webdriver_examples;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;

public class ClickLink 
{

	public static void main(String[] args)
	{
		FirefoxDriver driver = new FirefoxDriver();
		//driver.navigate().to("https://www.facebook.com/");
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();	
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.findElement(By.linkText("Create a Page")).click();
		driver.navigate().back();
		driver.findElement(By.partialLinkText("Why do I need to provide")).click();
		driver.navigate().refresh();
    }

}
