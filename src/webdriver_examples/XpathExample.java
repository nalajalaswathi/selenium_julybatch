package webdriver_examples;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class XpathExample {

	public static void main(String[] args) 
	{
		WebDriver driver = new FirefoxDriver();
	    driver.get("http://testingmasters.com/hrm/");
	    driver.manage().window().maximize();
	    driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	    driver.findElement(By.xpath("//*[@id='txtUsername']") ).sendKeys("user01");
        driver.findElement(By.xpath("//*[@id='txtPassword']")).sendKeys("pass1234");
        driver.findElement(By.xpath("//*[@id='btnLogin']")).click();

	}

}
