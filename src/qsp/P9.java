package qsp;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class P9 {
	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}

	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get("file:///C:/Users/qspid/Desktop/2CSM8/B.html");
		driver.findElement(By.id("un")).sendKeys("DINGA");		
		driver.findElement(By.id("pw")).sendKeys("DINGI");		
		driver.findElement(By.className("h1")).click();		
		driver.navigate().back();		
		driver.findElement(By.name("a1")).click();
		driver.findElement(By.className("b1")).click();
		driver.close();
		
	}

}
