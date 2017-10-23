package webdriver_examples;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class VerificationMethods {

	public static void main(String[] args)
	{
		FirefoxDriver driver = new FirefoxDriver();
		driver.get("http://demo.nopcommerce.com/register");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		String URL = driver.getCurrentUrl();
		System.out.println("URL IS: " + URL);
		WebElement chk = driver.findElement(By.id("Newsletter"));
		 Boolean a = chk.isDisplayed();
		 if(a)
		 {
			 System.out.println("chekbox is displayed");
		 }
		 else
		 {
			 System.out.println("chekbox is not displayed");
		 }
		 Boolean b = chk.isSelected();
		 if(b)
		 {
			 System.out.println("chekbox is selected");
		 }
		 else
		 {
			 System.out.println("chekbox is not selected");
		 }
		 Boolean c = chk.isEnabled();
		 if(c)
		 {
			 System.out.println("chekbox is enabled");
		 }
		 else
		 {
			 System.out.println("chekbox is not enabled");
		 }
	}

}
