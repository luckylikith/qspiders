package qsp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class P13 {
	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://www.fb.com");
		driver.switchTo().activeElement().sendKeys("DINGA");
		Thread.sleep(2000);
		driver.findElement(By.id("pass")).sendKeys("DINGI");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[.='Log In']")).click();
		Thread.sleep(5000);
		driver.close();
		

	}

}
