package datadriven.Excel.Keywords;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Read_TestCases {

	public static void main(String[] args) throws Exception {

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\MINDQ DSNR\\Downloads\\chromedriver_win32\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));

		Excel.getexcel("Excel.xlsx", "Testcases");
		for (int i = 1; i <= Excel.GetRowCount(); i++) {

			String Testname = Excel.getCellData(i, 0);
			String inputdata = Excel.getCellData(i, 1);
			String expresult = Excel.getCellData(i, 2);
			String exestatus = Excel.getCellData(i, 3);

			String url = "https://login.live.com/login.srf?wa=wsignin1.";
			By Email = By.xpath("//input[@id='i0116']");
			if (exestatus.equalsIgnoreCase("y")) {
				driver.get(url);
				driver.findElement(Email).sendKeys(inputdata + Keys.ENTER);
				Thread.sleep(5000);

				// Read Visible text at webpage
				String PageText = driver.findElement(By.tagName("body")).getText();
				if (PageText.contains(expresult)) {
					Excel.WriteCellData_At_newCell(i, 4, "Testpass");
					System.out.println(Testname + "     " + "Testpass");
				} else {
					Excel.WriteCellData_At_newCell(i, 4, "Testfail");
					System.out.println(Testname + "     " + "TestFail");
				}
			}

		}

		Excel.CreateOtuputFile("NewOutput.xlsx");
	}

}
