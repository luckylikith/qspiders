package qsp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CssSel {
	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://demo.actitime.com/login.do");
driver.findElement(By.cssSelector("input[placeholder='Username']")).sendKeys("admin");
		Thread.sleep(2000);
driver.findElement(By.cssSelector("input[class='textField pwdfield']")).sendKeys("manager");
		Thread.sleep(2000);
		driver.findElement(By.cssSelector("a[class='initial']")).click();
		Thread.sleep(5000);
		driver.close();
	}

}
