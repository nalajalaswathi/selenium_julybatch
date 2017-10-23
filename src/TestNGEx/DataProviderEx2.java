package TestNGEx;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataProviderEx2 
{
	/*
	@Test(dataProvider="login credentials")
	public void login(String username,String password)
	{
		
		System.out.println(username + "::::" +password);
	}
	@DataProvider(name="login credentials")
	public Object[][] getdatafromdataprovider()
	{
		return new Object[][]{
				{"swathi","pass1992"},
				{"devanshi","pass2016"},
				{"samba","pass1985"}
		};
	}
	*/
	
	@Test(dataProvider="google search")
	public void googlesearch(String author, String searchkey)
	{
		System.out.println("author is:::: " + author + " searchkey is:-::::" + searchkey);
	}
	@DataProvider(name="google search")
	public Object[][] getdatafromdataprovider()
	{
		return new Object[][]{
				{"tmaster1","USA"},
				{"tmasters2","UK"}
		};
	}

}
