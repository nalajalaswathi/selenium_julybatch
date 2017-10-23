package webdriver_examples;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.firefox.FirefoxDriver;

public class CaptureScreenShot {

	public static void main(String[] args) throws IOException
	{
		FirefoxDriver driver=new FirefoxDriver();
		driver.get("https://www.google.co.in/");
	    driver.manage().window().maximize();
	    File scrFile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
	    FileUtils.copyFile(scrFile, new File("E:\\screenshot6.png"));
	}

}
