package TestNGEx;

import org.testng.annotations.Test;

public class ParalleleExecution
{
	    @Test
	    public void test1() throws InterruptedException
	    {
		   for(int i=1;i<=5;i++)
		   {
		     System.out.println("i am test 1");
		     Thread.sleep(50);
		   }
		   
	    }
		@Test
		public void test2() throws InterruptedException
		{
			for(int i=1;i<=5;i++)
			{
			  System.out.println("i am test 2");
			  Thread.sleep(50);
		    }
			
        }     
}
