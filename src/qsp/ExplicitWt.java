package qsp;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ExplicitWt {
	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}
	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(0));
		driver.get("http://demo.actitime.com/login.do");
		String firstPageTitle = driver.getTitle();
		System.out.println("First Page Title: "+firstPageTitle);
		driver.findElement(By.xpath("//input[@name='username']")).sendKeys("admin");
		driver.findElement(By.xpath("//input[@placeholder='Password']")).sendKeys("manager");
		driver.findElement(By.xpath("//div[.='Login ']")).click();
		wait.until(ExpectedConditions.titleContains("Enter"));
		String secondPageTitle = driver.getTitle();
		System.out.println("Second Page Title: "+secondPageTitle);
		driver.findElement(By.xpath("//a[@id='logoutLink']")).click();
		wait.until(ExpectedConditions.titleIs("actiTIME - Login"));
		String thirdPageTitle = driver.getTitle();
		System.out.println("Third Page Title: "+thirdPageTitle);
		if(firstPageTitle.equals(thirdPageTitle)) {
			System.out.println("Test is passed");
		}
		else {
			System.out.println("Test is failed");
		}
		driver.close();
	}

}
