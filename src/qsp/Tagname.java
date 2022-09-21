package qsp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Tagname {
	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("file:///C:/Users/qspid/Desktop/2CSM8/C.html");
		WebElement googleLink = driver.findElement(By.tagName("a"));
		googleLink.click();
		Thread.sleep(2000);
		driver.navigate().back();
		Thread.sleep(2000);
		//WebElement fbLink = driver.findElement(By.tagName("a"));//clicks on google
		WebElement fbLink = driver.findElement(By.linkText("Facebook"));
		fbLink.click();
		Thread.sleep(4000);
		driver.close();

	}

}
