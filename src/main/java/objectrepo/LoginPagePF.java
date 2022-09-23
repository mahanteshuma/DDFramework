package objectrepo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPagePF {

	WebDriver driver;

	public void LoginPagePFData(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	

	@FindBy (id="input-email")
	private WebElement emailbox;

	@FindBy(id = "input-password")
	private WebElement passwordbox;

	@FindBy(xpath = "//input[@value='Login']")
	private WebElement loginButton;
	

	public WebElement emailbox() {
		return emailbox;
	}

	public WebElement passwordbox() {
		return passwordbox;
	}

	public WebElement loginButton() {
		return loginButton;
	}
}