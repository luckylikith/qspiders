package qsp;

import org.openqa.selenium.firefox.FirefoxDriver;

public class P2 {
	static {
		System.setProperty("webdriver.gecko.driver", "./driver/geckodriver.exe");
	}

	public static void main(String[] args) throws InterruptedException {
		FirefoxDriver driver = new FirefoxDriver();
		driver.get("http://www.google.com");
		Thread.sleep(3000);
		driver.close();

	}

}
