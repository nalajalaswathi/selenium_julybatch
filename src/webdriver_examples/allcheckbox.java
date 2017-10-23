package webdriver_examples;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class allcheckbox {

	public static void main(String[] args)
	{
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
		List<WebElement> allchk =  driver.findElements(By.xpath("//input[@type='checkbox']"));
		int number = allchk.size();
		System.out.println("no.of chkboxes present on webpage is:" + number);
		
		/*for(int i=0;i<number;i++)
		{
			String chk_names = "allchk.get(i).getText()";
			System.out.println(chk_names);
			//allchk.get(i).click();
		}
		*/
	}

}






