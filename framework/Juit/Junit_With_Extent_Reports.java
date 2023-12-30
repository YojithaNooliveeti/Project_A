package framework.Juit;

import java.time.Duration;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.TestName;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

import datadriven.Excel.Keywords.Excel;

public class Junit_With_Extent_Reports 
{
	//System.setProperty("webdriver.chrome.driver","C:\\Users\\MINDQ DSNR\\Downloads\\chromedriver_win32\\chromedriver.exe");

	static WebDriver driver;
	static ExtentReports reporter;
	static WebDriverWait wait;
	static String filepath = "reports\\Junit.html";
	static ExtentTest test;
	static XSSFSheet sht;
	String url = "http://facebook.com";

	// Get Current Test access
	public @Rule TestName mytest = new TestName();

	@Before
	public void PreCondition() throws Exception {
		// Getting Current Constructed @Test method name
		test = reporter.startTest(mytest.getMethodName());
		driver.get(url);
	}

	@After
	public void PostCondition() {
		reporter.endTest(test);
	}

	@BeforeClass
	public static void Setup() throws Exception {
		driver = new ChromeDriver();
		wait = new WebDriverWait(driver, Duration.ofSeconds(30));
		reporter = new ExtentReports(filepath, true);
	}

	@AfterClass
	public static void TearDown() {
		driver.close();
		reporter.flush();
	}

	@Test
	public void Tc001_Login_invalid() {
		Assert.assertEquals("BQ", "BQ");
		test.log(LogStatus.PASS, "Text is matching");
	}

	@Test
	public void Tc002_Login_Blank() {
		Assert.assertEquals(10, 10);
		test.log(LogStatus.PASS, "Numers are matching");
	}

	@Test
	public void Tc002_Login_Entry() {
		test.log(LogStatus.PASS, "ReEntryCompleted");
		Excel.getexcel("InputData.xlsx", "config");
		test.log(LogStatus.INFO, Excel.getCellData(1, 0));
	}

}
