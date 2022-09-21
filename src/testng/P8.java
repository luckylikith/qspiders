package testng;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class P8 {
	WebDriver driver;
	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}
	@BeforeMethod
	public void openApp() {
		driver = new ChromeDriver();
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
	}
	@Test
	public void testApp() {
		System.out.println("Test begins");
		String expectedTitle = "facebook";
		driver.get("http://www.google.com");
		String actualTitle = driver.getTitle();
		Reporter.log("Expected Title: " + expectedTitle,true);
		Reporter.log("Actual Title: " + actualTitle,true);
		SoftAssert s1 = new SoftAssert();
		if (expectedTitle.equals(actualTitle)) {	
			Reporter.log("Test is passed",true);
		} else {		
			Reporter.log("Test is failed",true);
			s1.fail();
		}
		System.out.println("Test ends");//wont be executed
		s1.assertAll();
	}
	@AfterMethod
	public void closeApp() {
		driver.close();
	}

}
