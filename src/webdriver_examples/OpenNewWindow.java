package webdriver_examples;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class OpenNewWindow {

	public static void main(String[] args)
	{
		WebDriver driver = new FirefoxDriver();
		driver.get("http://www.google.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		WebElement link_gmail = driver.findElement(By.linkText("Gmail"));
		Actions act = new Actions(driver);
		//open gmail in new window
		act.contextClick(link_gmail).sendKeys(Keys.ARROW_DOWN).sendKeys(Keys.ENTER).perform();
		
		//open gmail in new window
		//act.contextClick(link_gmail).sendKeys(Keys.ARROW_DOWN).sendKeys(Keys.ARROW_DOWN).sendKeys(Keys.ENTER).perform();
	}

}
