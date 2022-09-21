package qsp;

import org.openqa.selenium.firefox.FirefoxDriver;

public class B {
	static {
		System.setProperty("webdriver.gecko.driver", "./driver/geckodriver.exe");
	}
	public static void main(String[] args) {
		FirefoxDriver driver = new FirefoxDriver();
		TestGoogle t2=new TestGoogle();
		t2.test(driver);

	}

}
