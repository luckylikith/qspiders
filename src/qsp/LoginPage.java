package qsp;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
	@FindBy(id = "username")
	private WebElement untb;// decla
	final String x = "pwd";
	@FindBy(name = x)
	private WebElement pwtb;
	@FindBy(xpath = "//div[.='Login ']")
	private WebElement loginBtn;

	LoginPage(WebDriver driver) {

		PageFactory.initElements(driver, this);// POM framework
	}

	public void setUsername(String un) {
		untb.sendKeys(un);// utili
	}

	public void setPassword(String pw) {
		pwtb.sendKeys(pw);
	}

	public void clickLogin() {
		loginBtn.click();
	}
}
