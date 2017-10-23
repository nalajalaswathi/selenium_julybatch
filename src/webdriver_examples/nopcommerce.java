package webdriver_examples;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class nopcommerce {

	public static void main(String[] args)
	{
		FirefoxDriver driver = new FirefoxDriver();
		driver.get("http://demo.nopcommerce.com/register");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.findElement(By.id("gender-female")).click();
		driver.findElement(By.id("FirstName")).sendKeys("swathi");
		driver.findElement(By.id("LastName")).sendKeys("devanshi");
		Select day_sel = new Select(driver.findElement(By.name("DateOfBirthDay")));
		day_sel.selectByVisibleText("15");
		Select mon_sel = new Select(driver.findElement(By.name("DateOfBirthMonth")));
		mon_sel.selectByVisibleText("August");
		Select year_sel = new Select(driver.findElement(By.name("DateOfBirthYear")));
		year_sel.selectByVisibleText("1992");
		driver.findElement(By.id("Email")).sendKeys("nalajalaswathi28@gmail.com");
		driver.findElement(By.id("Company")).sendKeys("Testing Masters");
		driver.findElement(By.id("Password")).sendKeys("devanshikakarla");
		driver.findElement(By.id("ConfirmPassword")).sendKeys("devanshikakarla");
		driver.findElement(By.id("register-button")).click();
	}

}
