package webdriver_examples;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class HRMlogin
{
   
	public static void main(String[] args) 
	{
	
	//execution in chromedriver
		/*  System.setProperty("webdriver.chromedriver", "E:\\chromedriver.exe");
		    ChromeDriver driver = new ChromeDriver();
		*/ 
		
		
	//execution in internetexplorerdriver
		 /* System.setProperty("webdriver.ie.driver", "E:\\chromedriver.exe");
		    InternetExplorerDriver driver = new InternetExplorerDriver();
		 */
	      
		
		// WebDriver driver = new ChromeDriver();
		
		  FirefoxDriver driver=new FirefoxDriver();		  				  
	      driver.get("http://testingmasters.com/hrm/");
	      driver.manage().window().maximize();
		  driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	      driver.findElement(By.id("txtUsername")).sendKeys("user01");
	      driver.findElement(By.id("txtPassword")).sendKeys("pass1234");
	      driver.findElement(By.id("btnLogin")).click();
    }
}