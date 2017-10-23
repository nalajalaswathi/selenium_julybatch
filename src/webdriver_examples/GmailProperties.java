package webdriver_examples;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;

public class GmailProperties {

	public static void main(String[] args) throws IOException
	{
		FileInputStream fis =new FileInputStream(System.getProperty("user.dir")+"\\src\\webdriver_examples\\object.properties");
		Properties props = new Properties();
		props.load(fis);		
		FirefoxDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		driver.get("https://accounts.google.com/signin");
		driver.findElement(By.id(props.getProperty("Username_id"))).sendKeys("nalajalaswathi28@gmail.com");
		driver.findElement(By.cssSelector(props.getProperty("next1_cssSelector"))).click();
		driver.findElement(By.name(props.getProperty("password_name"))).sendKeys("kdevanshi");
		driver.findElement(By.cssSelector(props.getProperty("next2_cssSelector"))).click();
	}

}
