package qsp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandlingFrames {
	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("file:///C:/Users/qspid/Desktop/2CSM8/Page1.html");
		driver.findElement(By.id("t1")).sendKeys("ABCD ");
		driver.switchTo().frame(50);
		driver.findElement(By.id("t2")).sendKeys("1234 ");
		driver.switchTo().parentFrame();
		driver.findElement(By.id("t1")).sendKeys("WXYZ ");
		driver.switchTo().frame("f1");
		driver.findElement(By.id("t2")).sendKeys("5678 ");
		driver.switchTo().defaultContent();
		driver.findElement(By.id("t1")).sendKeys("MNOP ");
		WebElement page2 = driver.findElement(By.xpath("//iframe"));
		driver.switchTo().frame(page2);
		driver.findElement(By.id("t2")).sendKeys("DINGA ");
		Thread.sleep(3000);
		driver.close();
	}

}
