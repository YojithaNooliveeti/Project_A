package extent_Reports;

import com.relevantcodes.extentreports.ExtentReports;

public class Create_Extent_Reports {

	public static void main(String[] args) {
		String filepath = "C:\\Users\\MINDQ DSNR\\Desktop\\Selenium_Wor\\selenium1_java\\Reportss.html";

		ExtentReports reporter = new ExtentReports(filepath, true);

		reporter.flush(); // Save and Exit

	}

}
