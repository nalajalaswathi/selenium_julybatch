package Grid;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.Platform;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.BrowserType;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.Test;



public class GridEx {
	
	@Test
	public void testFF() throws MalformedURLException
	{
		DesiredCapabilities capability = DesiredCapabilities.firefox();
		capability.setBrowserName("firefox");
		capability.setPlatform(Platform.WINDOWS);
		URL url = new URL("http://localhost/wd/hub");
		WebDriver driver = new  RemoteWebDriver(url,capability);
		driver.get("http://learn-automation");
		System.out.println("title is:- "+ driver.getTitle());
	}
	
	@Test
	public void testchrome() throws MalformedURLException
	{
		DesiredCapabilities capability = DesiredCapabilities.chrome();
		capability.setBrowserName(BrowserType.CHROME);
		capability.setPlatform(Platform.WINDOWS);
		URL url = new URL("http://localhost/wd/hub");
		WebDriver driver = new  RemoteWebDriver(url,capability);
		driver.get("http://learn-automation");
		System.out.println("title is:- "+ driver.getTitle());
	}

	

}
