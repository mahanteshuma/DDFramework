package opencartproject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class RegisterAccount2 {

	WebDriver driver;

	@FindBy(name = "password")
	private WebElement Password;

	@FindBy(name = "confirm")
	private WebElement Pconfirm;

	@FindBy(xpath = "//input[@name='agree']")
	private WebElement Agreebox;

	@FindBy(xpath = "//input[@value='Continue']")
	private WebElement ContinueButton;

	

	public RegisterAccount2(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	public void Password() {
		Password.sendKeys("Mahantesh@444");
	}

	public void Pconfirm() {
		Pconfirm.sendKeys("Mahantesh@444");
	}

	public void Agreebox() {
		Agreebox.click();
	}

	public void ContinueButton() {
		ContinueButton.click();
	}

}
