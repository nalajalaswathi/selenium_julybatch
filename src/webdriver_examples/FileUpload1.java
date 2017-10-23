package webdriver_examples;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import org.openqa.selenium.firefox.FirefoxDriver;

//EXAMPLE FOR UPLOADING A FILE BY USING SENDKEYS
public class FileUpload1 {

	public static void main(String[] args)
	{
		WebDriver driver = new FirefoxDriver();
		driver.get("http://testingmasters.com/hrm/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		//login to HRM page
		driver.findElement(By.id("txtUsername")).sendKeys("user01");
	    driver.findElement(By.id("txtPassword")).sendKeys("pass1234");
	    driver.findElement(By.id("btnLogin")).click();
	    
	    //navigate to my info page
	    driver.findElement(By.id("menu_pim_viewMyDetails")).click();
	    driver.findElement(By.id("btnAddAttachment")).click();//click on add  buton 
	    driver.findElement(By.id("ufile")).sendKeys("E:\\HRM.xlsx"); //choosefile button
	    driver.findElement(By.id("btnSaveAttachment")).click();//click on upload button
	}

}
