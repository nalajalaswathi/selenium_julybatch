package webdriver_examples;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;



public class DropDown_Ex 
{

	public static void main(String[] args)
	{
       FirefoxDriver driver = new FirefoxDriver();
       driver.get("http://output.jsbin.com/osebed/2");
       driver.manage().window().maximize();
       driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
       Select dd_multiple = new Select(driver.findElement(By.id("fruits")));
       if(dd_multiple.isMultiple())
       {
    	   System.out.println("it allows multiple selection of dropdown items");
       }
       dd_multiple.selectByVisibleText("Banana");
       dd_multiple.selectByIndex(1);
       dd_multiple.selectByValue("orange");
		
	}

}
