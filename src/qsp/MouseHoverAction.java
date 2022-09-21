package qsp;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseHoverAction {
	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.manage().window().maximize();
		driver.get("https://www.vtiger.com");
		
		//to do mouse hover action
		WebElement resources = driver.findElement(By.xpath("(//a[contains(.,'Resources')])[1]"));
		Actions act = new Actions(driver);
		act.moveToElement(resources).build().perform();
		Thread.sleep(4000);
		driver.findElement(By.xpath("(//a[contains(.,'Contact Us')])[1]")).click();
		
		WebElement phNo = driver.findElement(By.xpath("//p[contains(.,'Bengaluru')]/../p[2]"));
		System.out.println(phNo.getText());
		Thread.sleep(4000);
		driver.close();
	}

}
