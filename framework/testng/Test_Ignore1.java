package framework.testng;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Test_Ignore1 
{
	
  @Test(enabled=false)
  public void test1() 
  {
	  Reporter.log("test1 Executed");
  }
  
  @Test
  public void test2() 
  {
	  Reporter.log("tes2 Executed");
  }
}
