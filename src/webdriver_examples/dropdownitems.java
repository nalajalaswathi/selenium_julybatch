package webdriver_examples;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class dropdownitems {

	public static void main(String[] args) {
		WebDriver driver = new FirefoxDriver();
		driver.get("http://newtours.demoaut.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.findElement(By.name("userName")).sendKeys("mercury");
		driver.findElement(By.name("password")).sendKeys("mercury");
		driver.findElement(By.name("login")).click();
		//------------DISPLAY ALL ITEMS FROM DROPDOWN LIST IN MERCURY TOURS---------
		WebElement dd_items = driver.findElement(By.xpath("//select[@name='fromPort']"));
		List<WebElement> allitems = dd_items.findElements(By.tagName("option"));
		/*for(WebElement items:allitems)
		{
			String txt = items.getText();
			System.out.println(txt);
		}*/
		int n = allitems.size();
		System.out.println(n);
		
		for(int i=0;i<n ; i++)
		{
			String str = allitems.get(i).getText();
			System.out.println(str);
		}	
		

	}

}
