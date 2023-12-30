package extent_Reports;

import java.io.File;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

public class Extent_Reports_Using_ScreenShot {

	public static void main(String[] args) throws Exception 
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\MINDQ DSNR\\Downloads\\chromedriver_win32\\chromedriver.exe");
		
	// Create Extent Report
		String Filepath = "C:\\Users\\MINDQ DSNR\\Desktop\\Selenium_Wor\\selenium1_java\\Reportss4.html";
		ExtentReports logger = new ExtentReports(Filepath, true);
		System.out.println("Reporter file created");

		ExtentTest test1 = logger.startTest("Tc001_loginvalid");

		WebDriver driver = new ChromeDriver();
		driver.get("http://facebook.com");

	// Capture screen using webdriver scripting
		String screen1_path = "C:\\Users\\MINDQ DSNR\\git\\Project_215\\abc\\screens\\Screen11.png";
		File src = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		FileHandler.copy(src, new File(screen1_path));

	// Attach screen to extent report file.
		test1.log(LogStatus.PASS, test1.addScreenCapture(screen1_path), "Homepage Displayed");

	// Flush all runtime test reports to HTML file
		logger.endTest(test1);

	// flush all reports to file..
		logger.flush();

	}

}
