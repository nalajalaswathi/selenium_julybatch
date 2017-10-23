package webdriver_examples;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.firefox.FirefoxDriver;

public class Google {

	public static void main(String[] args) 
	{
		FirefoxDriver driver=new FirefoxDriver();
	    driver.get("https://www.google.co.in/");
	    driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	    String title = driver.getTitle();
	    if(title.contentEquals("Google"))
	    {
	    	System.out.println("Google page is opened ,pass");
	    }
	    else
	    {
	    	System.out.println("Google page is not opened,Fail");
	    }
	    System.out.println("page title is:- " + title);

	}

}
