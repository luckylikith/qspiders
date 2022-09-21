package qsp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class FBListBox {
	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://www.fb.com");
		driver.findElement(By.xpath("//a[.='Create New Account']")).click();
		Thread.sleep(2000);
		driver.findElement(By.name("firstname")).sendKeys("DINGA");
		Thread.sleep(2000);
		driver.findElement(By.name("lastname")).sendKeys("PANDEY");
		Thread.sleep(2000);
		driver.findElement(By.name("reg_email__")).sendKeys("9876543210");
		Thread.sleep(2000);
		driver.findElement(By.id("password_step_input")).sendKeys("DINGI");
		Thread.sleep(2000);
		WebElement dateLB = driver.findElement(By.id("day"));
		Select s1 = new Select(dateLB);
		s1.selectByVisibleText("15");
		Thread.sleep(2000);
		WebElement monthLB = driver.findElement(By.id("month"));
		Select s2 = new Select(monthLB);
		s2.selectByVisibleText("Aug");
		Thread.sleep(2000);
		WebElement yearLB = driver.findElement(By.id("year"));
		Select s3 = new Select(yearLB);
		s3.selectByVisibleText("1947");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@value='2']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//button[.='Sign Up'])[1]")).click();
		Thread.sleep(4000);
		driver.close();
	
	}

}
