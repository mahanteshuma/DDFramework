package inetBanking_V1com.inetbanking.testCases;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.io.FileHandler;

public class Screenshot {
	WebDriver driver;
	public static void captureScreenshot(WebDriver driver) throws IOException {
		
		File src=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		
		String path = "./Screenshots"+System.currentTimeMillis()+".jpg";
		
		File dest = new File(path);
		FileHandler.copy(src, dest);
		
	}

}
