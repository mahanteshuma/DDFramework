package opencartproject;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class RegisterAccountPageTest {

	WebDriver driver;
    @Test
	public void RegisterPassword() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize();
		driver.get("http://tutorialsninja.com/demo/index.php?route=account/register");

		RegisterAccount ra=new RegisterAccount(driver);
		ra.SendFname();
		ra.SendLname();
		ra.SendEmail();
		ra.SendTphone();
		
		RegisterAccount2 ra2=new RegisterAccount2(driver);
		ra2.Password();
		ra2.Pconfirm();
		ra2.Agreebox();
		ra2.ContinueButton();
	}

}
