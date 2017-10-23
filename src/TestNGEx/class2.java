package TestNGEx;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class class2 
{
	@BeforeClass
	public void BC()
	{
		System.out.println("Before Class Executed");
	}
	@BeforeMethod
	public void BM()
	{
		System.out.println("Before Method Executed");
	}
	@AfterMethod
	public void AM()
	{
		System.out.println("After Method Executed");
	}
	@BeforeTest
	public void BT()
	{
		System.out.println("Before Test Executed");
	}
	@AfterTest
	public void AT()
	{
		System.out.println("After Test Executed");
	}
	
	@Test (enabled=false) //(priority=0)
	public void TC2()
	{
		System.out.println("TC2 Executed");
	}
	@Test (priority=1)
	public void TC1()  
	{
		System.out.println("TC1 Executed");
	}
}
