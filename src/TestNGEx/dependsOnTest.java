package TestNGEx;

import org.testng.annotations.Test;

import junit.framework.Assert;

public class dependsOnTest {

	@Test
	public void login()
	{
		System.out.println("login successfully");
		//Assert.assertTrue(false);
	}
	@Test(dependsOnMethods={"login","logout"})
	public void Inbox()
	{
		System.out.println("inbox  page is opened");
	}
	@Test(dependsOnMethods={"login"})
	public void logout()
	{
		System.out.println("logout successfully ");
	}
}
