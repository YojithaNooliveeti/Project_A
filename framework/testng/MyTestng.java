package framework.testng;

import org.junit.Test;
import org.testng.Reporter;

	public class MyTestng {
		@Test
		public void test1() {
			Reporter.log("Browser is opened", true);
		}

		@Test
		public void test2() {
			Reporter.log("URL is typed", true);
		}

		@Test
		public void test3() {
			Reporter.log("Login Completed",true);
		}

	}

