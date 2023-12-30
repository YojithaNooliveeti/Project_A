package fw_TesNG.groupss;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Mindq2 {
	 @Test(groups="Reg1")
	  public void tc004() 
	  {
		 Reporter.log("tc004  Executed",true);
	  }
	  
	  @Test
	  public void tc005() 
	  {
		  Reporter.log("tc005  Executed",true);
	  }
	  
	  
	  @Test(groups="Reg2")
	  public void tc006() 
	  {
		  Reporter.log("Tc006 executed",true);
	  }
	  
	  
	  @Test(groups="Reg1")
	  public void tc0010() 
	  {
		  Reporter.log("Tc006 executed",true);
	  }
}
