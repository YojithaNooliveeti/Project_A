package extent_Reports;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;

public class Create_Test_Reports {

	public static void main(String[] args) {

		// Create Html file
		String filepath = "C:\\Users\\MINDQ DSNR\\Desktop\\Selenium_Wor\\selenium1_java\\Reportss1.html";
		ExtentReports reporter = new ExtentReports(filepath, true);

		// Create Test Under html file
		ExtentTest Test1 = reporter.startTest("Tc001_Login_valid");

		reporter.endTest(Test1);

		// Create Test Under html file
		ExtentTest Test2 = reporter.startTest("Tc002_Login_Invalid");

		reporter.endTest(Test2);

		// Create Test under html file
		ExtentTest Test3 = reporter.startTest("Tc003_Login_Duplicate");

		reporter.endTest(Test3);

		reporter.flush(); // Save and genarate report

	}

}
