package framework.testng;

import org.junit.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class Test_Priority {

	@Test(priority = 0)
	public void Instagrampage() 
	{
		Assert.assertEquals("Gmail", "Gmail");
		Reporter.log("Instagram Title is Verified");
	}

	@Test(priority = 2)
	public void Gamil_page() 
	{
		Assert.assertEquals("Gmail", "Gmail");
		Reporter.log("Gmail Title is Verified");
	}

	@Test(priority = 1)
	public void FacebookPage() 
	{
		Assert.assertTrue(true);
		Reporter.log("Gmail Title is Verified");
	}

}
