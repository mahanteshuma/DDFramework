package orangehrm;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class HRMTest {

	WebDriver driver;

	@Test
	public void HRMLogin() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");

		LoginHRM data = new LoginHRM(driver);
		data.username().sendKeys("Admin");
		data.password().sendKeys("admin123");
		data.loginButton().click();

	}

}
