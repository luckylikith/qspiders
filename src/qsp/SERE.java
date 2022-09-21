package qsp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SERE {
	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://www.google.com");
		
		WebElement googleTB = driver.findElement(By.name("q"));
		driver.navigate().refresh();
		googleTB.sendKeys("ABCD");
		
		
		Thread.sleep(2000);
		driver.close();
	}

}
