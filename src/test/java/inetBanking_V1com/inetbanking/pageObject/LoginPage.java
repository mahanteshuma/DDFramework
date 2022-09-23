package inetBanking_V1com.inetbanking.pageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {

	WebDriver driver;

	public LoginPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	@FindBy(name = "uid")
	WebElement UserID;

	@FindBy(name = "password")
	WebElement Password;

	@FindBy(name = "btnLogin")
	WebElement LoginButton;

	public void UserID(String username) {
		UserID.sendKeys(username);
	}

	public void Password(String password) {
		Password.sendKeys(password);
	}

	public void LoginButton() {
		LoginButton.click();
	}

}
