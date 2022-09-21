package qsp;

import org.openqa.selenium.chrome.ChromeDriver;

public class P3 {
	static {
System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}
	public static void main(String[] args) {
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://www.amazon.com");
		String src = driver.getPageSource();
		System.out.println(src);
		driver.close();

	}

}
