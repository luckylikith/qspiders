package qsp;

import java.util.Set;

import org.openqa.selenium.chrome.ChromeDriver;

public class P6 
{
	static 
	{
System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}
	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demoqa.com/browser-windows");
		Thread.sleep(15000);//open 2-3 child browsers manually
		String address = driver.getWindowHandle();
		System.out.println(address);
		Set<String> allAddresses = driver.getWindowHandles();
		System.out.println(allAddresses);
		//driver.close();//closes only parent browser
		driver.quit();//closes all the browsers
	}

}
