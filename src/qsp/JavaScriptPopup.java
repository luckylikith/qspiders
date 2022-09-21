package qsp;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class JavaScriptPopup {
	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.manage().deleteAllCookies();
		driver.get("http://demo.actitime.com/login.do");
		driver.findElement(By.xpath("//input[@name='username']")).sendKeys("admin");
		driver.findElement(By.xpath("//input[@placeholder='Password']")).sendKeys("manager");
		driver.findElement(By.xpath("//div[.='Login ']")).click();
		driver.findElement(By.xpath("//div[.='Tasks']")).click();
		driver.findElement(By.xpath("//div[.='Add New']")).click();
		driver.findElement(By.xpath("//div[.='+ New Customer']")).click();
driver.findElement(By.xpath("(//input[@placeholder='Enter Customer Name'])[2]")).sendKeys("ABCD");
		driver.findElement(By.xpath("//div[@class='greyButton cancelBtn']")).click();		
		Thread.sleep(3000);
		
		//to handle this popup
		Alert a1 = driver.switchTo().alert();		
		System.out.println(a1.getText());
		//a1.accept();//clicks on OK button
		a1.dismiss();//clicks on Cancel button
			
		Thread.sleep(3000);
		driver.close();
	}

}
