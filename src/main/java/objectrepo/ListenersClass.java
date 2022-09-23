package objectrepo;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.SkipException;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ListenersClass {
	@Test
	public void classlistenersA() {
		int a=3,b=5,c=6;
		WebDriver driver;
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://omayo.blogspot.com/");
		
		if(a==1) {
			Assert.assertTrue(b<c);
		}else if(a==2) {
			Assert.assertTrue(b>c);
		}else if(c==3) {
			throw new SkipException("Test Skipped");
		}
	}
	
	@Test
	public void classlistenersB() {
		int a=3,b=5,c=6;
		WebDriver driver;
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://omayo.blogspot.com/");
		
		if(a==1) {
			Assert.assertTrue(b<c);
		}else if(a==2) {
			Assert.assertTrue(b>c);
		}else if(c==3) {
			throw new SkipException("Test Skipped");
		}
	
	}
}
