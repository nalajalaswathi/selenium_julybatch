package TestNGEx;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class AllAnnatations 
{

	@Test
	public void test6()
	{
		System.out.println("i am test6()");
	}
	@Test
	public void test7()
	{
		System.out.println("i am test7()");
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
}
