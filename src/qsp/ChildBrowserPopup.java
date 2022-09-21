package qsp;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ChildBrowserPopup {
	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.manage().window().maximize();
		driver.get("https://demoqa.com/browser-windows");
		driver.findElement(By.id("windowButton")).click();
		Thread.sleep(1000);
		driver.findElement(By.id("windowButton")).click();
		Thread.sleep(1000);
		driver.findElement(By.id("windowButton")).click();
		//to handle this popup
		Thread.sleep(5000);
		String parentWindow = driver.getWindowHandle();//fetches the address of parent browser
		System.out.println(parentWindow);
		Set<String> allWindows = driver.getWindowHandles();////fetches the address of all browsers
		System.out.println(allWindows);
		for(String v : allWindows) {
			if(v.equals(parentWindow)) {	
			}
			else {
				Thread.sleep(2000);
				driver.switchTo().window(v).close();
			}		}			}
	}
