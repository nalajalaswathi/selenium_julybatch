package TestNGEx1;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class GroupsTest1 
{
	@BeforeClass(groups={"sanity","regression","database"})
	public void setup()
	{
		System.out.println("setup()");
	}
	@Test(groups={"sanity","regression"})
	public void test1()
	{
		System.out.println("groups={sanity,regression}");
	}
	@Test(groups={"sanity"})
	public void test2()
	{
		System.out.println("groups={sanity}");
	}
	@Test(groups={"sanity","database"})
	public void test3()
	{
		System.out.println("groups={sanity,database}");
	}
	@Test(groups={"regression"})
	public void test4()
	{
		System.out.println("groups={regression}");
	}
	@Test(groups={"sanity","regression"})
	public void test5()
	{
		System.out.println("groups={sanity,regression}");
	}

}
