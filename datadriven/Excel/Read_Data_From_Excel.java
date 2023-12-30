package datadriven.Excel;

import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Read_Data_From_Excel {

	public static void main(String[] args) throws IOException 
	{
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\MINDQ DSNR\\Downloads\\chromedriver_win32\\chromedriver.exe");
		
		
	// Target file from local system
		FileInputStream fi = new FileInputStream("TestData\\Excel.xlsx");
		System.out.println("File located");

		// Get Workbook access
		XSSFWorkbook book = new XSSFWorkbook(fi);

		// Get sheet using book reference
		XSSFSheet sht = book.getSheet("config");

		// Target using sheet Reference
		XSSFRow row = sht.getRow(1);

		// Target cell using row reference
		XSSFCell cell = row.getCell(0);

		// Reading Character from excel cell
		String browser = cell.getStringCellValue();
		System.out.println(browser);

		WebDriver driver = null;
		if (browser.equals("chrome")) {
			driver = new ChromeDriver();
		} else if (browser.equals("firefox")) {
			driver = new FirefoxDriver();
		}

		// Read url from excel
		String url = row.getCell(1).getStringCellValue();
		driver.get(url);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));

		By UID = By.xpath("//input[contains(@name,'email')]");
		By PWD = By.xpath("//input[@type='password']");
		By LOGIN = By.xpath("//button[@name='login']");

		String username = row.getCell(2).getStringCellValue();
		String password = row.getCell(3).getStringCellValue();

		driver.findElement(UID).sendKeys(username);
		driver.findElement(PWD).sendKeys(password);
		driver.findElement(LOGIN).click();

	}

	}


