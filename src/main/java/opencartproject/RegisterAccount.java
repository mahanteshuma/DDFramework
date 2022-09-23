package opencartproject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class RegisterAccount {

	WebDriver driver;

	@FindBy(name="firstname")
	private WebElement Fname;

	@FindBy(name="lastname")
	private WebElement Lname;

	@FindBy(name="email")
	private WebElement Email;

	@FindBy(name="telephone")
	private WebElement Tphone;
	
	

	public  RegisterAccount(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	public void SendFname() {
		Fname.sendKeys("Mahantesh");
	}

	public void SendLname() {
		 Lname.sendKeys("Uma");
	}

	public void SendEmail() {
		 Email.sendKeys("mahantesh@gmail.com");
	}

	public void SendTphone() {
		Tphone.sendKeys("94816063");
	}

}
