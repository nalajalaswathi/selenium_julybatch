package webdriver_examples;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class MercuryTours {

	public static void main(String[] args)
	{
		FirefoxDriver driver = new FirefoxDriver();
		driver.get("http://newtours.demoaut.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.findElement(By.name("userName")).sendKeys("mercury");
		driver.findElement(By.name("password")).sendKeys("mercury");
		driver.findElement(By.name("login")).submit();   //.click();
		WebElement rd_triptype = driver.findElement(By.xpath("(//input[@name='tripType'])[2]"));
		rd_triptype.click();
		Select dd_passengers = new Select(driver.findElement(By.xpath("//select[@name='passCount']")));
		dd_passengers.selectByVisibleText("2");
		Select dd_departure = new Select(driver.findElement(By.xpath("//select[@name='fromPort']")));
		dd_departure.selectByIndex(2);
		Select dd_on_month = new Select(driver.findElement(By.xpath("//select[@name='fromMonth']")));
		dd_on_month.selectByIndex(5);
		Select dd_on_day = new Select(driver.findElement(By.xpath("//select[@name='fromDay']")));
		dd_on_day.selectByVisibleText("1");
		Select dd_arraiving = new Select(driver.findElement(By.xpath("//select[@name='toPort']")));
		dd_arraiving.selectByVisibleText("Paris");
		Select dd_returning_month = new Select(driver.findElement(By.xpath("//select[@name='toMonth']")));
		dd_returning_month.selectByIndex(5);
		Select dd_returning_day = new Select(driver.findElement(By.xpath("//select[@name='toDay']")));
		dd_returning_day.selectByVisibleText("10");
		WebElement rd_serviceclass = driver.findElement(By.xpath("(//input[@name='servClass'])[3]"));
		rd_serviceclass.click();
		Select airline = new Select(driver.findElement(By.name("airline")));
		airline.selectByIndex(1);
		driver.findElement(By.name("findFlights")).click();
		WebElement rd_depart = driver.findElement(By.xpath(("(//input[@name='inFlight'])[2]")));
		rd_depart.click();
		WebElement rd_return = driver.findElement(By.xpath("(//input[@name='outFlight'])[2]"));
		rd_return.click();
		driver.findElement(By.xpath("//p/input")).click();
		driver.findElement(By.name("passFirst0")).sendKeys("swathi");
		driver.findElement(By.name("passLast0")).sendKeys("kakarla");
		Select dd_meals1 = new Select(driver.findElement(By.name("pass.0.meal")));
	    dd_meals1.selectByVisibleText("Hindu");
		driver.findElement(By.name("passFirst1")).sendKeys("devanshi");
		driver.findElement(By.name("passLast1")).sendKeys("kakarla");
		Select dd_meals2 = new Select(driver.findElement(By.name("pass.1.meal")));
		dd_meals2.selectByVisibleText("Hindu");
		driver.findElement(By.name("buyFlights")).click();
		driver.close(); //close the browser
		

	}

}