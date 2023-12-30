package bookMyshow_Pagefactory;

import java.io.File;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class PageFactoryRepo_Class {
	
	@FindBy(xpath = "//span[text()='Hyderabad']")
	public static WebElement city_xpath;

	@FindBy(xpath = "//div[text()='Atharva']")
	public static WebElement movie_xpath;

	@FindBy(xpath = "(//button[@data-phase='postRelease'])[1]")
	public static WebElement Booktickets_xpath;

	//@FindBy(xpath = "(//button[@data-phase='postRelease'])[1]")
	//public static WebElement Selectdate_xpath;
	
	@FindBy(xpath = "//div[contains(@class,'disabled')]")
	public static WebElement Type2D_xpath;

	@FindBy(xpath = "//a[@class='showtime-pill' and @data-session-id='1339']")
	public static WebElement SelectPM_xpath;

	@FindBy(xpath = "//div[@id='proceed-Qty']")
	public static WebElement SelectSeats_xpath;

	@FindBy(xpath = "//div[@id='A_1_05']")
	public static WebElement BalconySeats_xpath;

	@FindBy(xpath = "(//a[@id='btmcntbook'])[1]")
	public static WebElement Pay_xpath;

	@FindBy(xpath = "(//div[@id='btnPopupAccept'])[1]")
	public static WebElement alert_xpath;

	// @FindBy(xpath="//div[@id='prePay']")
	// public static WebElement pay_xpath;

//How to Handle the Alert text in Runtime
	public static void Alerttxt(WebDriver driver) {
		String alttxt = driver.switchTo().alert().getText();
		System.out.println(alttxt);
	}

	// How to Handle the Alert in Runtime
	public static void Alert1(WebDriver driver) {
		driver.switchTo().alert().accept();
		// driver.switchTo().alert().dismiss();

	}

	// Implicitly wait
	public static void Implicitlywait(WebDriver driver, int sec) {
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(sec));
	}
	
	
	public static void ExplicitlyWait(WebDriver  driver) {

		try {
			
			new WebDriverWait(driver,Duration.ofSeconds(30)).until(ExpectedConditions.visibilityOf(PageFactoryRepo_Class.SelectPM_xpath));
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			System.out.println("the try catch is finished");
		}
	}
	
	

	// How to take the Screen shot in Runtime

	public static void CaptureScreen(WebDriver driver, String imagename) {
		try {

			File src = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
			FileHandler.copy(src, new File("screens\\" + imagename + ".png"));

		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}

}
