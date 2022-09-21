package testng;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class P6 {

	@BeforeClass
	public void q1() {
		System.out.println("before class");
	}
	
	@AfterClass
	public void q2() {
		System.out.println("after class");
	}
	
	@Test
	public void test() {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://www.amazon.com");
		List<WebElement> allLinks = driver.findElements(By.xpath("//a"));
		System.out.println("All Links count: "+allLinks.size());
		driver.close();
	}
	
	@AfterSuite
	public void f2() {
		System.out.println("After suite");
	}
}
