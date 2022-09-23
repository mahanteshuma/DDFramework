package inetBanking_V1com.inetbanking.testCases;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Test;

import inetBanking_V1com.inetbanking.pageObject.LoginPage;

public class TC_001_LoginTest extends BaseClass {

	@Test
	public void LoginTest() throws IOException {
		driver.get(baseURL);
		logger.info("URL is Opened");

		LoginPage lp = new LoginPage(driver);
		lp.UserID(username);
		logger.info("Enter username");
		lp.Password(password);
		logger.info("Enter password");
		lp.LoginButton();

		if (driver.getTitle().equals("Guru99 Bank Manager HomePage")) {
			Assert.assertTrue(true);
			Screenshot.captureScreenshot(driver);
			logger.info("Login Test Pass");

		} else {
			Assert.assertTrue(false);
			logger.info("Login Test Fail");
		}

	}

}
