package testNGListnerPractice;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class TestNGListner implements ITestListener {

	public void onTestStart(ITestResult result) {
		System.out.println("***** Test Name : " + result.getName());
	}

	public void onTestSuccess(ITestResult result) {
		System.out.println("***** Test is successful : " + result.getName());
	}

	public void onTestFailure(ITestResult result) {
		System.out.println("***** Test failed : " + result.getName());
	}

	public void onTestSkipped(ITestResult result) {
		System.out.println("***** Test skipped : " + result.getName());
	}

	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
		System.out.println("***** Test Name : " + result.getName());
	}

	public void onStart(ITestContext context) {
		
	}

	public void onFinish(ITestContext context) {
		System.out.println("***** Test complete : " + context.getName());

	}



}
