package qsp;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class P4 {
	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}

	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver = new ChromeDriver();
		Thread.sleep(2000);
		driver.manage().window().maximize();
		driver.get("http://www.fb.com");
		Thread.sleep(2000);
		driver.switchTo().activeElement().sendKeys("dinga");
		Thread.sleep(2000);
		driver.switchTo().activeElement().clear();
		Thread.sleep(2000);
		driver.close();

	}
	
}
