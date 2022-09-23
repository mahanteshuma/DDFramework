package TestNG.TestNGClassProject;

import org.testng.annotations.Test;

public class Priority {
	@Test(priority=1)
	public void MultiTest() {
		
		System.out.println("Hello TestNG");
	}
	@Test(priority=2)
	public void Login() {
		System.out.println("Print Login done");
	}
	@Test(priority=-1)
	public void HomePage() {
		System.out.println("Print HomePage Open");
	}
	@Test
	public void UI() {
		System.out.println("We inside UI Now");
	}

}
