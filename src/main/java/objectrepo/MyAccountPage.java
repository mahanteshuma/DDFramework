package objectrepo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class MyAccountPage {
	WebDriver driver;

	public MyAccountPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	public void myaccountpage(WebDriver driver) {
		this.driver = driver;
	}

	@FindBy(xpath = "//ul[@class='breadcrumb']//a[text()='Account']")
	private WebElement myaccountbreadcrum;

	public WebElement myaccountbreadcrum() {
		return myaccountbreadcrum;
	}
}
