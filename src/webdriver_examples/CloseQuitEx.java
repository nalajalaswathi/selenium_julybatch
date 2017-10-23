package webdriver_examples;

import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class CloseQuitEx 
{
	public static void main(String[] args) throws InterruptedException
	{
		WebDriver driver = new FirefoxDriver();
		driver.get("https://www.talentzing.com/DiscountedTraining/TrainerRegistration.aspx");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.findElement(By.linkText("FAQ")).click();
		driver.findElement(By.linkText("FeedBack")).click();
		
		//get homepage window handle
		String homepage = driver.getWindowHandle();
		Thread.sleep(3000);
		
		//get subbrowser window handle
		Set<String> allhandles = driver.getWindowHandles();
		Thread.sleep(3000);
		
		for(String wndhandle:allhandles)
		{
			//move focus to FAQ page
			driver.switchTo().window(wndhandle);
			String pageURL = driver.getCurrentUrl();
			if(pageURL.contains("FrequentlyAskedQuestions"))
			{
				System.out.println("switched to faq page");
				driver.close();//close FAQ page
				break;//exit from the loop
			}
		}
		//switch to home page browser
		driver.switchTo().window(homepage);
		driver.quit();//closes all browsers opened through webdriver
	}
}
