package webdriver_examples;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxProfile;
import org.openqa.selenium.firefox.internal.ProfilesIni;

public class UserProfilesEx {

	public static void main(String[] args)
	{
	 
	  ProfilesIni profile = new ProfilesIni();
	  FirefoxProfile myprofile = profile.getProfile("swathi");
	  WebDriver driver = new FirefoxDriver(myprofile);
	  driver.get("http://www.gmail.com/");
	  driver.manage().window().maximize();
	  
	}

}
