package TestNG.TestNGClassProject;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class AnnotationsAll {
	@BeforeSuite
	public void suit() {
		System.out.println("Im in before suite");
	}

	@BeforeTest
	public void setTest() {
		System.out.println("Im in Before Test");
	}

	@BeforeClass
	public void browser() {
		System.out.println("BeforeClass");
	}

	@BeforeMethod
	public void setup() {
		System.out.println("BeforeMethod");
	}

	@Test()
	public void Login() {
		System.out.println("Test 1");
	}

	@Test()
	public void HomePage() {
		System.out.println("Test 2");
	}

	

	@AfterMethod
	public void setupCloser() {
		System.out.println("AfterMethod");
	}

	@AfterClass
	public void closebrowser() {
		System.out.println("AfterClass");
	}

	@AfterTest
	public void closesettest() {
		System.out.println("AfterTest");
	}

	@AfterSuite
	public void closesuit() {
		System.out.println("AfterSuite");
	}
}
