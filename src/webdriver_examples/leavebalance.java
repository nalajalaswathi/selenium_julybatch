package webdriver_examples;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class leavebalance {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new FirefoxDriver();
		driver.get("http://testingmasters.com/hrm");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
		
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
		Thread.sleep(3000);//it will blindly wait for 3 seconds
		String leave_bal_cellvalue = driver.findElement(By.xpath("//*[@id='resultTable']/tbody/t[1]r/td[4]")).getText();
		System.out.println(leave_bal_cellvalue);
	}

}
