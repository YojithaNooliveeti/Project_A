package bookMyshow_Pagefactory;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class PageFactory_TestableClass {

	public static void main(String[] args) {

		
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\MINDQ DSNR\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get(InputData_Class.App_url);
		driver.manage().window().maximize();

		// Create object for PageFactory

		PageFactory.initElements(driver, PageFactoryRepo_Class.class);
		PageFactoryRepo_Class.Implicitlywait(driver, 20);

		PageFactoryRepo_Class.city_xpath.click();
		PageFactoryRepo_Class.movie_xpath.click();
		PageFactoryRepo_Class.Booktickets_xpath.click();
		//PageFactoryRepo_Class.Type2D_xpath.click();

		//PageFactoryRepo_Class.Selectdate_xpath.click();
		PageFactoryRepo_Class.ExplicitlyWait(driver);
		PageFactoryRepo_Class.SelectPM_xpath.click();
	
		/*//Explicit wait
		public void ExplicitlyWait(driver) {

			try {
				
				new WebDriverWait(driver,Duration.ofSeconds(30)).until(ExpectedConditions.visibilityOf(PageFactoryRepo_Class.SelectPM_xpath));
			} catch (Exception e) {
				e.printStackTrace();
			}finally {
				System.out.println("the try catch is finished");
			}
		}*/
		
		
		PageFactoryRepo_Class.SelectSeats_xpath.click();
		PageFactoryRepo_Class.BalconySeats_xpath.click();
		PageFactoryRepo_Class.Pay_xpath.click();

		PageFactoryRepo_Class.Alerttxt(driver);
		PageFactoryRepo_Class.Alert1(driver);
		PageFactoryRepo_Class.CaptureScreen(driver, "Bookmyshow");

	}

}
