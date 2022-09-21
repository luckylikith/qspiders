package qsp;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestGoogle {//senior

	public void test(WebDriver dr) {
		dr.get("http://www.google.com");
		System.out.println(dr.getTitle());
		System.out.println(dr.getCurrentUrl());
		dr.close();
	}
}
