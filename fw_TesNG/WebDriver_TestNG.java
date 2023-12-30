package fw_TesNG;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class WebDriver_TestNG {

	// System.setProperty("webdriver.chrome.driver", "C:\\Users\\MINDQ
	// DSNR\\Downloads\\chromedriver_win32\\chromedriver.exe");

	WebDriver driver;
	String url = "http://facebook.com";
	String path = "C:\\Users\\MINDQ DSNR\\Downloads\\chromedriver_win32\\chromedriver.exe";

	@Test(priority = 1, dependsOnMethods = "Title")
	public void Login() {

		driver.findElement(By.cssSelector("#email")).sendKeys("asdfhgieg");
		driver.findElement(By.cssSelector("#pass")).sendKeys("123wed4556");
		//driver.findElement(By.xpath("//button[@name='login']")).click();
	}

	@Test(priority = 0)
	public void Title() {
		String Exp_Title = "Facebook – log in or sign up";
		Assert.assertEquals(driver.getTitle(), Exp_Title);
		Reporter.log("Title Displayed" + driver.getTitle());
		Assert.assertTrue(true);
	}

	@Test(priority=2,dependsOnMethods= {"Title","Login"}) // Invoke @test without Object creation and Main method
	public void Verify_Signup() {

		driver.findElement(By.xpath("//a[contains(.,'Sign Up')]")).click();
		String Exp_Title = "Sign up for Facebook | Facebook";
		Assert.assertEquals(driver.getTitle(), Exp_Title);
		Reporter.log("Title Displayed" + driver.getTitle());
	}

	@Test(enabled = false)
	public void Verify_Messanger() {

		driver.findElement(By.xpath("//a[contains(.,'Messenger')]")).click();
		String Exp_Title = "Messenger";
		Assert.assertEquals(driver.getTitle(), Exp_Title);
		Reporter.log("Title is Displayed" + driver.getTitle());
	}

	@BeforeMethod
	public void Before_Method() throws Exception {

		driver.get(url);
		Thread.sleep(2000);

	}

	@BeforeClass
	public void Before_Class() {

		System.setProperty("webdriver.chrome.driver", path);
		driver = new ChromeDriver();
		driver.manage().window().maximize();

	}

}
