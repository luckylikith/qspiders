package qsp;

import org.openqa.selenium.chrome.ChromeDriver;

public class P5 {
	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}

	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();// deletes all the cookie memory
		driver.get("https://www.myntra.com");
		Thread.sleep(2000);
		driver.navigate().to("https://www.google.com");
		Thread.sleep(2000);
		driver.navigate().to("https://www.amazon.com");
		driver.navigate().back();// amazon to youtube
		driver.navigate().back();// youtube to myntra
		driver.navigate().forward();// myntra to youtube
		driver.navigate().refresh();// refreshes the youtube page
		driver.close();

	}

}
