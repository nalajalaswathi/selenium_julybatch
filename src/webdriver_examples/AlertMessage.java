package webdriver_examples;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class AlertMessage {

	public static void main(String[] args) 
	{
		WebDriver driver = new FirefoxDriver();
		driver.get("http://demo.guru99.com/selenium/delete_customer.php");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.findElement(By.xpath("html/body/form/table/tbody/tr[2]/td[2]/input")).sendKeys("12345");
		driver.findElement(By.xpath("html/body/form/table/tbody/tr[3]/td[2]/input[1]")).click();
		
		//switch to alert message
		Alert alertmsz = driver.switchTo().alert();
		System.out.println("alermessge is:-");
		System.out.println(alertmsz.getText());
		
		//switch to accept button in alert message
		alertmsz.accept();
		
		/*
		 //switch to cancel button in alert message
		  alertmsz.dismiss();
		 */
		

	}

}
