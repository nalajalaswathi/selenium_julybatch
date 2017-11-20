package webdriver_examples;

import java.util.Iterator;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class GetLink {

	public static void main(String[] args)
	{
		FirefoxDriver driver = new FirefoxDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		List<WebElement> links = driver.findElements(By.tagName("a"));
		
		/*//To itarate list of elements
		Iterator<WebElement> itr = links.iterator();
		while(itr.hasNext())
		{
			System.out.println(itr.next().getText());
		}
		*/
		
		int n = links.size();
		System.out.println(n);
		for(int i=0;i<n;i++)
		{
			String txt=links.get(i).getText();
			System.out.println(txt);
		}
		
	}

}
