package qsp;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AutoSugg {
	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}
	public static void main(String[] args) throws InterruptedException {
		//open the browser
		WebDriver driver = new ChromeDriver();
		//go to google
		driver.get("http://www.google.com");
		//type 'java' in search box
		driver.findElement(By.name("q")).sendKeys("java");
		//print the count of all suggestions
		Thread.sleep(1000);//very important
List<WebElement> allAutoSuggs = driver.findElements(By.xpath("//span[contains(.,'ava')]"));
		System.out.println("Total suggestions: "+ allAutoSuggs.size());
		//print every auto suggestions
		System.out.println("=================================================");
		for(int i=0;i<allAutoSuggs.size();i++) {
			System.out.println(allAutoSuggs.get(i).getText());
		}
		//click on third auto suggestion
		allAutoSuggs.get(2).click();
		//close the browser
		driver.close();
		
		
		

	}

}
