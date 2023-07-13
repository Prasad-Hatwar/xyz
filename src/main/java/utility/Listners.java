package utility;

import java.io.IOException;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import ecomm.baseclass.baseclass;

public class Listners extends baseclass implements ITestListener {

	@Override
	public void onTestStart(ITestResult result) {
		System.out.println("test has been started :"+result.getName());
	}

	@Override
	public void onTestSuccess(ITestResult result) {
		System.out.println("test has been success :"+result.getName());
	}

	@Override
	public void onTestFailure(ITestResult result) {
		System.out.println("test failed :"+result.getName());
		
		try {
			CapturedScreenShots.captureImages(driver, result.getName());
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	@Override
	public void onTestSkipped(ITestResult result) {
		System.out.println("test Skipped :"+result.getName());
	
	}

	@Override
	public void onStart(ITestContext context) {
		System.out.println("Execution started");
	}

	@Override
	public void onFinish(ITestContext context) {
		System.out.println("Execution finished");
	}
	
	

}
