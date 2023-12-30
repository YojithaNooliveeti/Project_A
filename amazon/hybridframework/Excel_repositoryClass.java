package amazon.hybridframework;

import java.io.File;
import java.time.Duration;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Excel_repositoryClass {

	public static WebDriver driver;

	public static void excelhelperclass(String Filename, String Sheetname) {

		Excel_connectionClass.excelConnection(Filename, Sheetname);

		String Application_url = Excel_connectionClass.excel_rows(1, 0);
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\MINDQ DSNR\\Downloads\\chromedriver_win32\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get(Application_url);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));

		/*WebDriverWait mywait = new WebDriverWait(driver, Duration.ofSeconds(30));
		WebElement element = mywait.until(ExpectedConditions.visibilityOfElementLocate()));
		element.click();*/
		
	}

	public static void excelhelperclass1(String Filename, String Sheetname, String Imagename) {

		Excel_connectionClass.excelConnection(Filename, Sheetname);
		int rowcount = Excel_connectionClass.sheet.getLastRowNum();

		System.out.println("the rowscount is====>" + rowcount);

		for (int i = 1; i < rowcount; i++) {

			String proname = Excel_connectionClass.excel_rows(i, 1);
			String provalue = Excel_connectionClass.excel_rows(i, 2);
			String actions = Excel_connectionClass.excel_rows(i, 3);
			System.out.println(actions);
			String inputdata = Excel_connectionClass.excel_rows(i, 4);

			switch (actions) {
			/*
			 * case "Textbox": WebElement ele =
			 * driver.findElement(Amazon_locators.ExcelLocators(proname, provalue));
			 * ele.click(); break;
			 */

			case "button":
				System.out.println("Button clicked");
				WebElement ele1 = driver.findElement(Amazon_locators.ExcelLocators(proname, provalue));
				ele1.click();
				break;
				
				
			case "hover":
				
				try {
					WebElement accesories=driver.findElement(Amazon_locators.ExcelLocators(proname, provalue));
					new Actions(driver).moveToElement(accesories).perform();
					
				} catch (Exception e) {
					e.printStackTrace();
				}
				break;
				
				
			case "click":
				try {
					
					WebElement clicks=driver.findElement(Amazon_locators.ExcelLocators(proname, provalue));
					new Actions(driver).moveToElement(clicks).click().perform();
					
					
				} catch (Exception e) {
					e.printStackTrace();
				}
				
				break;
			
			case "Capture":
				try {

					File src = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);

					FileUtils.copyFile(src, new File("screens12\\" + Imagename + ".png"));

				} catch (Exception e) {
					e.printStackTrace();
				}
				break;

			default:
				break;
			}

		}

	}

	/*public static void excelhelperclass2(String Filename, String Sheetname, String Imagename) {

		Excel_connectionClass.excelConnection(Filename, Sheetname);
		int rowcount1 = Excel_connectionClass.sheet.getLastRowNum();

		System.out.println("RoeCount+===>"+rowcount1);

		for (int i = 0; i < rowcount1; i++) {

			String proname = Excel_connectionClass.excel_rows(i, 1);
			String provalue = Excel_connectionClass.excel_rows(i, 2);
			String actions = Excel_connectionClass.excel_rows(i, 3);
			String inputdata = Excel_connectionClass.excel_rows(i, 4);

			switch (actions) {
			
			 * case "Textbox": WebElement ele =
			 * driver.findElement(Amazon_locators.ExcelLocators(proname, provalue));
			 * ele.click(); break;
			 

			case "button":
				WebElement ele1 = driver.findElement(Amazon_locators.ExcelLocators(proname, provalue));
				ele1.click();
				break;
			case "Capture":
				try {

					File src = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);

					FileUtils.copyFile(src, new File("screens12\\" + Imagename + ".png"));

				} catch (Exception e) {
					System.out.println(e.getMessage());
				}
				break;

			default:
				break;
			}
			
			}
			}*/

	
}

