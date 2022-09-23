package objectrepo;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class ListenersTest implements ITestListener {
	
	public void onTestStart(ITestResult result) {
		System.out.println("Test Execution Started: "+result.getName());
	}
	
	public void onFinish(ITestContext context) {
		System.out.println("Test Execution ended: "+context.getName());
	}
	
	public void onTestSuccess(ITestResult result) {
		System.out.println("Test Execution Successfull:"+result.getName());
	}
	
	public void onTestFailure(ITestResult result) {
		//Take a Screenshot
		//updating the failure status into the test reports
		//updating in logs
		
		System.out.println("Test execution failed: "+result.getName());
	}
	
	public void onTestSkipped(ITestResult result) {
		System.out.println("Test Skipped: "+result.getName());
	}

}
