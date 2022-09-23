package TestNG.TestNGClassProject;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.SkipException;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DemoTest {
	@Test
//	public void Passing() {
//		WebDriverManager.chromedriver().setup();
//		WebDriver driver=new ChromeDriver();
//		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
//		driver.get("https://omayo.blogspot.com/");
//		driver.manage().window().maximize();
//		
//		WebElement blog = driver.findElement(By.xpath("//span[@id='blogsmenu']"));
//		Actions a=new Actions(driver);
//		a.moveToElement(blog).perform();
//		//driver.close();
//	}
	
//	public void Falling() {
//		
//		int b=10/0;
//		
//	}
	
	public void Skipping() throws Exception {
		int a=5;
		if(a<18) {
			throw new SkipException("Age Less than 18");
		}
		
	}

}
