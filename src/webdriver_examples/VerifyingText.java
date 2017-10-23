package webdriver_examples;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class VerifyingText {

	public static void main(String[] args)
	{
		//EXAMPLE-1
		
		WebDriver driver = new FirefoxDriver();
		driver.get("http://www.testingmasters.com/hrm/");	
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		//by using xpath
		if(driver.findElement(By.xpath("//div[text()='LOGIN Panel']")).isDisplayed())
		{
			System.out.println("login panel exists");
		}
		else
		{
			System.out.println("login panel doesn't exists");
		}
		
		/*
		//by using get pagesource method
		String exptext = "LOGIN Panel";
		String pagetext = driver.getPageSource();
		boolean b= pagetext.contains(exptext);
		if(b)
		{
			System.out.println("login panel exists");
		}
		else
		{
			System.out.println("login panel not exists");
		}
		*/
	}

}
