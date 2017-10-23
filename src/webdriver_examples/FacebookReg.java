package webdriver_examples;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class FacebookReg 
{
	public static void main(String[] args) 
	{
	   FirefoxDriver driver = new FirefoxDriver();
	   driver.get("https://www.facebook.com/");
	   driver.manage().window().maximize();
	   driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	   //driver.findElement(By.name("firstname")).sendKeys("testing");
	   WebElement fname = driver.findElement(By.name("firstname"));
	   fname.clear();
	   fname.sendKeys("Testing");
	   driver.findElement(By.name("lastname")).sendKeys("Masters");
	   driver.findElement(By.name("reg_email__")).sendKeys("8790002007");
	   driver.findElement(By.name("reg_passwd__")).sendKeys("pass1234");
	   //working with dropdown in fb create account page:-
	   
	   //------------method 1-------------------------
	  /*
	   Select day_sel = new Select(driver.findElement(By.id("day")));
	   day_sel.selectByVisibleText("15");
	   Select mon_sel = new Select(driver.findElement(By.id("month")));
	   mon_sel.selectByVisibleText("Aug");
	   Select year_sel = new Select(driver.findElement(By.id("year")));
	   year_sel.selectByVisibleText("2005");
	   */
	   
	   //-------------method 2 by using xpath-----------------------------
	   driver.findElement(By.xpath("//select[@id='day']/option[text()='1']")).click();
	   driver.findElement(By.xpath("//select[@id='month']/option[text()='Jun']")).click();
	   driver.findElement(By.xpath("//select[@id='year']/option[text()='2016']")).click();
	   
	   driver.findElement(By.xpath("//input[@value='1' and @name='sex']")).click();//click the female radio button	   
	   driver.findElement(By.name("websubmit")).click(); //click createaccount button
	}

}
