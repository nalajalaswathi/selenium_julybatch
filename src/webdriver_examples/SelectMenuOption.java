package webdriver_examples;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

public class SelectMenuOption 
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
		
		//table rows count in myleave tab
		List<WebElement> trows = driver.findElements(By.xpath("//*[@id='resultTable']/tbody/tr"));
		int r = trows.size();
		System.out.println("table row count is:" + r);
		
		//table 5th row columns count in myleave tab
		List<WebElement> tcols = driver.findElements(By.xpath("//*[@id='resultTable']/tbody/tr[5]/td"));
		int c = tcols.size();
		System.out.println("table column count is:" + c);
		
		//table all columns count in myleave tab
		List<WebElement> allcols = driver.findElements(By.xpath("//*[@id='resultTable']/tbody/tr/td"));
		int tallcols = allcols.size();
		System.out.println("table allcolumn count is:" + tallcols);
		
		//display particular cell value(1st row 6th col-cell lvalue)
		String cel_val = driver.findElement(By.xpath("//*[@id='resultTable']/tbody/tr[1]/td[6]")).getText();
		System.out.println("1st row 6th col cell value is:" + cel_val);		
	}
}
