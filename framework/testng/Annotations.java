package framework.testng;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.jupiter.api.Test;
import org.testng.Reporter;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

 public class Annotations 
 {

	@Test
	public void test1() 
	{
		Reporter.log("Test1 Executed ",true );
		
	}

	@BeforeMethod // invoke before each @Test annotation
	public void beforeMethod() 
	{
		System.out.println("Test Precondition");
	}

	@AfterMethod // Invoke after each @Test annotation
	public void afterMethod() 
	{
		System.out.println("Test Postcondition");
	}

	
	@Test
	public void test2() 
	{
		Reporter.log("Test2 Executed ",true );
		
	}
	
	
	@BeforeClass // Invoke before first @Test
	public void beforeClass() 
	
    {
		System.out.println("Class PreCondition");
	}
	
	@Test
	public void test4()
	{
		Reporter.log("TEst4 Executed", true);
	}

	@AfterClass // Invoke after last @Test annoation
	public void afterClass() 
	{
		System.out.println("Class PostCondition");
	}

	@Test
	public void test3() 
	{
		Reporter.log("Test3 Executed ",false );
		
	}
	
}
