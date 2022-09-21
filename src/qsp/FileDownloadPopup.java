package qsp;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class FileDownloadPopup {

	static {
		System.setProperty("webdriver.gecko.driver", "./driver/geckodriver.exe");
	}

	public static void main(String[] args) throws InterruptedException, AWTException {
		WebDriver driver = new FirefoxDriver();
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		driver.get("https://www.google.com");
		
		Robot a1 = new Robot();
		a1.keyPress(KeyEvent.VK_CONTROL);
		a1.keyPress(KeyEvent.VK_S);
		a1.keyRelease(KeyEvent.VK_CONTROL);
		
		Thread.sleep(3000);
		a1.keyPress(KeyEvent.VK_ENTER);
		Thread.sleep(3000);
		a1.keyPress(KeyEvent.VK_LEFT);
		Thread.sleep(3000);
		a1.keyPress(KeyEvent.VK_ENTER);
		
		Thread.sleep(3000);
		driver.close();
	}

}
