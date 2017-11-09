package TestNGEx1;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class AllAnnatations1 
{
	@Test
	public void test1()
	{
		System.out.println("i am test1");
	}
	@Test
	public void test2()
	{
		System.out.println("i am test2");
	}
	@BeforeMethod
	public void BM()
	{
		System.out.println("before method executed");
	}
	@AfterMethod
	public void AM()
	{
		System.out.println("after method executed");
	}
	@BeforeClass
	public void BC()
	{
		System.out.println("before class executed");
	}
	@AfterClass
	public void AC()
	{
		System.out.println("after class executed");
	}
	@AfterTest
	public void AT()
	{
		System.out.println("after Test executed");
	}
	@BeforeTest
	public void BT()
	{
		System.out.println("Before Test executed");
	}
	@AfterSuite
	public void AS()
	{
		System.out.println("after Suite executed");
	}
	@BeforeSuite
	public void BS()
	{
		System.out.println("Before Suite executed");
	}
}


