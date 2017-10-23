package webdriver_examples;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class VerifyTextboxValue {

	public static void main(String[] args)
	{
		FirefoxDriver driver = new FirefoxDriver();
		   driver.get("https://www.facebook.com/");
		   driver.manage().window().maximize();
		   driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		   WebElement text_value = driver.findElement(By.id("email"));
		   text_value.sendKeys("Testing");
		  String s =  text_value.getText();
		  String v = text_value.getAttribute("value");
		  if(s==v)
		  {
			  System.out.println("same");
		  }
		  
	}

}
