package TestNG.TestNGClassProject;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Assertions {
    
	@Test
	public void Assert() {
		WebDriverManager.chromedriver().setup();// WebDriverManager setup
		WebDriver driver = new ChromeDriver(); // lunching chromebrowser
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("http://tutorialsninja.com/demo/");// opening URL
		driver.manage().window().maximize();

		//Navigate to Login page
		driver.findElement(By.xpath("//span[normalize-space()='My Account']")).click();
		driver.findElement(By.xpath("//a[normalize-space()='Login']")).click();
		driver.findElement(By.xpath("//input[@id='input-email']")).sendKeys("umamaha@gmail.com");
		driver.findElement(By.xpath("//input[@id='input-password']")).sendKeys("mahantesh@444");
		driver.findElement(By.xpath("//input[@value='Login']")).click();
		boolean account = driver.findElement(By.xpath("//a[normalize-space()='Account']")).isDisplayed();
		Assert.assertTrue(account);
		
		//Search Iphone
		driver.findElement(By.xpath("//input[@placeholder='Search']")).sendKeys("iPhone");
		driver.findElement(By.xpath("//button[@class='btn btn-default btn-lg']")).click();
		driver.findElement(By.xpath("//div[@class='caption']//a[contains(text(),'iPhone')]")).click();
		boolean iphone = driver.findElement(By.xpath("//ul[@class='breadcrumb']//a[contains(text(),'iPhone')]")).isDisplayed();
		Assert.assertTrue(iphone);
		
	}

}
