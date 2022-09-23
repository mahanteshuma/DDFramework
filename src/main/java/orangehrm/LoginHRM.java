package orangehrm;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginHRM {
	WebDriver driver;
	
	public LoginHRM(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	@FindBy(name = "username")
	private WebElement username;

	@FindBy(name = "password")
	private WebElement password;

	@FindBy(xpath = "//button[normalize-space()='Login']")
	private WebElement loginButton;

	

	public WebElement username() {
		return username;
	}

	public WebElement password() {
		return password;
	}

	public WebElement loginButton() {
		return loginButton;
	}

}
