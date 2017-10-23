package TestNGEx;

import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class ParametersXML 
{
	@Test
	@Parameters({"userName","password"})
	public void main(@Optional("userNameOptional") String userName,@Optional("passwordOptional") String password)
	{
		System.out.println("username is:- "+ userName + " password is:- " + password);
	}

}
