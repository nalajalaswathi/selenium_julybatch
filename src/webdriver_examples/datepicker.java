package webdriver_examples;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class datepicker {

	public static void main(String[] args) {
		WebDriver driver = new FirefoxDriver();
		driver.get("http://testingmasters.com/hrm");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		//HRM Login page code
		driver.findElement(By.id("txtUsername")).sendKeys("user01");
		driver.findElement(By.id("txtPassword")).sendKeys("pass1234");
		driver.findElement(By.id("btnLogin")).click();
		
		//mouse over on leave menu in hrm home page  
		WebElement leave = driver.findElement(By.id("menu_leave_viewLeaveModule"));
		Actions obj = new Actions(driver);
		obj.moveToElement(leave).build().perform();
				
		//click on myleave tab under leave menu in hrm home page
		driver.findElement(By.id("menu_leave_viewMyLeaveList")).click();
		
		//---------------method 1 :to send date to the textbox------
		driver.findElement(By.xpath(".//*[@id='calFromDate']")).click();
		driver.findElement(By.xpath(".//*[@id='calFromDate']")).clear();
		driver.findElement(By.xpath(".//*[@id='calFromDate']")).sendKeys("2016-06-01");
		driver.findElement(By.xpath(".//*[@id='calFromDate']")).sendKeys(Keys.ESCAPE);
	
		//-------------------OR---------------------
		
		//---------------method 2 :to select date from the calender------
		/*
		driver.findElement(By.xpath(".//*[@id='frmFilterLeave']/fieldset/ol/li[1]/img")).click();
		driver.findElement(By.xpath(".//*[@id='ui-datepicker-div']/div/div/select[1]/option[text()='Jun']")).click();
		driver.findElement(By.xpath(".//*[@id='ui-datepicker-div']/div/div/select[2]/option[text()='2016']")).click();
		driver.findElement(By.xpath(".//a[text()='1']")).click();
		*/
		
		
	}

}
