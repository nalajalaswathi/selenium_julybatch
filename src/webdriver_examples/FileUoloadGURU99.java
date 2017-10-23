package webdriver_examples;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class FileUoloadGURU99 {

	public static void main(String[] args) throws IOException
	{
		WebDriver driver = new FirefoxDriver();
		driver.get("https://www.guru99.com/become-an-instructor.html");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.findElement(By.xpath("//input[@id='input_1']")).sendKeys("devanshi");
		driver.findElement(By.id("input_2")).sendKeys("nalajalaswathi28@gmail.com");
		driver.findElement(By.id("input_3")).sendKeys("Autoit in selenium");
		driver.findElement(By.id("file")).click();
		
		//autoit file
		Runtime.getRuntime().exec("‪‪E:\\guru99.exe");
		
		driver.findElement(By.id("input_5")).click();
	}
}
