package framework.testng;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Test_Description 
{

	@Test(priority = 1, description = "Verifying Login with valid data")
	public void tc001() 
	{
		Reporter.log("Login Valid Successful");
	}

	@Test(priority = 0)
	public void tc002() 
	{
		Reporter.log("Login InValid Successful");
	}
}
