package webdriver_examples;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;

public class GetLinks1 {

	public static void main(String[] args)
	{
		FirefoxDriver driver = new FirefoxDriver();
		driver.get("https://www.gmail.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.findElement(By.name("identifier")).sendKeys("nalajalaswathi28@gmail.com");
		//driver.findEent(By.xpath(".//*[@id='identifierNext']/content/span")).click();
		driver.findElement(By.cssSelector("span.RveJvd.snByac")).click();  //use Selinium IDE to find out NEXT button element properties
		driver.findElement(By.name("password")).sendKeys("kdevanshi");
	}

}
