package qsp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class XpathGroupIndex {

	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		
		
		
		
		WebDriver driver = new ChromeDriver();
		driver.get("file:///C:/Users/qspid/Desktop/2CSM8/G.html");
		driver.findElement(By.xpath("(//input)[4]")).sendKeys("Text box 4");
		driver.findElement(By.xpath("(//input)[1]")).sendKeys("text box 1");
		driver.close();

		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
