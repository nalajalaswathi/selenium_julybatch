package TestNGEx;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Dataprovider3
{

	@Test(dataProvider="swathi")
	public void test1(String msz1,String msg2)
	{
		System.out.println("hiii");
	}
	
	@DataProvider(name="swathi")
	public Object[][] dataproviderTest()
	{
		return new Object[][]
		{
			{"hai","hai"},
			{"hello","hello"},
			{"madam","madam"}
		
		};
				
	}
	
}
