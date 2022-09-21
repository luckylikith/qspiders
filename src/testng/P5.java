package testng;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;


public class P5 {
	WebDriver driver;
	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}	
	@Test(priority=1)
	public void testGoogle() {
		driver.get("http://www.google.com");
		System.out.println("Title: "+driver.getTitle());
		System.out.println("URL: "+driver.getCurrentUrl());
	}
	@BeforeMethod
	public void openApp() {
		driver = new ChromeDriver();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.manage().window().maximize();	
	}	
	@AfterMethod
	public void closeApp() {
		driver.close();
	}	
	@Test(priority=2)
	public void testFB() {
		driver.get("http://www.fb.com");
		System.out.println("Title: "+driver.getTitle());
		System.out.println("URL: "+driver.getCurrentUrl());
	}
	
	
	
}
