package objectTest;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;


public class LoginTest {

	WebDriver driver;

	@Test
	public void logintest() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("http://tutorialsninja.com/demo/index.php?route=account/login");
		driver.manage().window().maximize();
//
//		LoginPagePF logindata=new LoginPagePF();
//		logindata.emailbox().sendKeys("umamaha@gmail.com");
//		logindata.passwordbox().sendKeys("mahantesh@444");
//		logindata.loginButton().click();

		
	}

	@AfterMethod
	public void closer() {
		driver.quit();
	}

}
