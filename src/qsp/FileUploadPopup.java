package qsp;

import java.io.File;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FileUploadPopup {
	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.manage().window().maximize();
		driver.get("file:///C:/Users/qspid/Desktop/2CSM8/H.html");
		
		// to handle this popup
		Thread.sleep(5000);
		WebElement chooseFileButton = driver.findElement(By.id("a1"));
		File f1 = new File("./cv/ABC.pdf");
		String absPath = f1.getAbsolutePath();
		System.out.println(absPath);
		chooseFileButton.sendKeys(absPath);
		Thread.sleep(3000);
		driver.close();
		
		
		
		
		
		
		
		
		
		

	}

}
