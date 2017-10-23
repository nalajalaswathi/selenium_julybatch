package webdriver_examples;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class HRM_table_element 
{
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
		obj.moveToElement(leave).click().build().perform();
		
		//click on myleave tab under leave menu in hrm home page
		driver.findElement(By.id("menu_leave_viewMyLeaveList")).click();
		driver.findElement(By.id("leaveList_chkSearchFilter_checkboxgroup_allcheck")).click();
		 driver.findElement(By.id("leaveList_chkSearchFilter_0")).click();
		driver.findElement(By.id("btnSearch")).click();
		List<WebElement> trows = driver.findElements(By.xpath("//*[@id='resultTable']/tbody/tr"));
		int rows = trows.size();
		
		String expDate = "2016-05-31";
		 for(int i=1;i<=rows;i++)
		 {
			
			 WebElement link=  driver.findElement(By.xpath("//*[@id='resultTable']/tbody/tr["+i+"]/td[1]/a"));
			 String text = link.getText();
				
				if(text.contains(expDate))
				{		
				    link.click();
					break;
				}			
		}
			
	}
}//xpath(".//*[@id='resultTable']/tbody/tr/td/a")
