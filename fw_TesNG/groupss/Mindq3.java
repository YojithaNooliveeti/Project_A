package fw_TesNG.groupss;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

@Test(groups = "Reg3")
public class Mindq3 {
	@Test(groups = "Reg2")
	public void tc007() {
		Assert.assertTrue(true);
		Reporter.log("tc007  Executed", true);
	}

	@Test(groups = "Reg1")
	public void tc008() {
		Reporter.log("Tc008 executed", true);
	}

	@Test(groups = "Reg2")
	public void tc009() {
		Reporter.log("Tc008 executed", true);
	}

}
