package qsp;

import org.openqa.selenium.chrome.ChromeDriver;

public class P1 {
	static {
System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}

	public static void main(String[] args) {
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://www.google.com");//enters the url
//String pageTitle = driver.getTitle();
//System.out.println(pageTitle);
System.out.println("Title: " + driver.getTitle());//fetches the title
System.out.println("URL: " + driver.getCurrentUrl());//fetches the URL
		driver.close();

	}

}
