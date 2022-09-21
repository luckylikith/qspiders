package qsp;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestLogin {
	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}
	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.get("https://demo.actitime.com/login.do");
		LoginPage l1 = new LoginPage(driver);
		l1.setUsername("abcd");
		Thread.sleep(2000);
		l1.setPassword("1234");
		Thread.sleep(2000);
		l1.clickLogin();//page gets refreshed
		Thread.sleep(3000);
		l1.setUsername("wxyz");
		Thread.sleep(2000);
		l1.setPassword("5678");
		Thread.sleep(2000);
		l1.clickLogin();
		Thread.sleep(3000);
		l1.setUsername("admin");
		Thread.sleep(2000);
		l1.setPassword("manager");
		Thread.sleep(2000);
		l1.clickLogin();
		Thread.sleep(5000);
		driver.close();
	}

}
