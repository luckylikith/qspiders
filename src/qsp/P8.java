package qsp;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class P8 {
	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
			}

	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("file:///C:/Users/qspid/Desktop/2CSM8/A.html");	
		driver.findElement(By.linkText("Google")).click();	
		driver.navigate().back();	
		driver.findElement(By.linkText("Facebook")).click();	
		driver.navigate().back();
		driver.close();
	}

}
