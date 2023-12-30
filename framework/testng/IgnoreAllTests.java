package framework.testng;

import org.junit.Ignore;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class IgnoreAllTests {
	@Ignore

	@Test
	public void test1() {
		Reporter.log("test1 verified", true);
	}

	@Test(enabled = false)
	public void tc002() {
		Reporter.log("Test2 Executed", true);
	}

	@Test
	public void tc003() {
		Reporter.log("Test3 Executed", true);
	}
}
