package TestNgsessions;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TestNGbBasic {
	WebDriver driver;
	@BeforeMethod
	public void setUp(){
		System.setProperty("webdriver.chrome.driver", "C:\\chromedriver_win32\\chromedriver.exe");
		driver =new ChromeDriver();
		driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get("https://www.freecrm.com/index.html");
	}
		
		@Test
		public void verifyPageTitleTest() {
			String title=driver.getTitle();
			System.out.println("the page title is:"+ title);
			Assert.assertEquals(title ,"#1 Free CRM software in the cloud for sales and service");
		
		}

		
	@AfterMethod
	public void tearDown() {
		driver.close();
	}
	
}
