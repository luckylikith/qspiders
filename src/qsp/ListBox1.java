package qsp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class ListBox1 {
	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.get("file:///C:/Users/qspid/Desktop/2CSM8/Hotel.html");		
		WebElement tajLB = driver.findElement(By.id("taj"));
		Select s1 = new Select(tajLB);
		s1.selectByIndex(0);//butter chicken
		Thread.sleep(1000);
		s1.selectByValue("ka");//kavva biryani
		Thread.sleep(1000);
		s1.selectByVisibleText("Jhinga fry");//jhinga fry
		Thread.sleep(1000);
//		s1.deselectByIndex(3);
//		Thread.sleep(1000);
//		s1.deselectByValue("ka");
//		Thread.sleep(1000);
//		s1.deselectByVisibleText("Butter Chicken");
		s1.deselectAll();
		Thread.sleep(1000);
		driver.close();
		
		
	}

}
