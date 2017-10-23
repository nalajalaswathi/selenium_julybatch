package webdriver_examples;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;


public class HRM_Exception {

	public static void main(String[] args)
	{
		  WebDriver driver=new FirefoxDriver();
	      driver.get("http://testingmasters.com/hrm/");
	      driver.manage().window().maximize();
	      try
	      {
	    	  driver.findElement(By.id("Username")).sendKeys("user01");
		      driver.findElement(By.id("txtPassword")).sendKeys("pass1234");
		      driver.findElement(By.id("btnLogin")).click();
	      }
	      catch(Exception e)
	      {
	    	  System.out.println("login code failed...");
	    	  e.printStackTrace();
	      }
	      finally
	      {
	    	  driver.close();
	      }
	}

}
