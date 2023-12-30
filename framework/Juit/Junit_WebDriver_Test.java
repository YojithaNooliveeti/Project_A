package framework.Juit;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

class Junit_WebDriver_Test {

	private WebDriver driver;

	@Before
	public void setUp() {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\MINDQ DSNR\\Downloads\\chromedriver_win32\\chromedriver.exe");

		driver = new ChromeDriver();
		driver.manage().window().maximize();
	}

	@Test
	public void LoginTest() {
		driver.get("https://www.facebook.com/");
		Assert.assertEquals("Facebook – log in or sign up", driver.getTitle());
		driver.findElement(By.xpath("//input[@id='email']")).sendKeys("yojitha");
		driver.findElement(By.xpath("//input[@id='pass']")).sendKeys("wqwerty");
		driver.findElement(By.xpath("//button[@name='login']")).click();

	}

	@After
	public void tearDown() {
		driver.quit();
	}
}
