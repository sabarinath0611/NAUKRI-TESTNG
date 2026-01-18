package com.listner;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import com.aventstack.extentreports.MediaEntityBuilder;
import com.base.Base_Class;

import zmq.ZError.IOException;

public class ITestListnerClass extends Base_Class implements ITestListener {

	@Override
	public void onTestStart(ITestResult result) {
		
	
	}
	@Override
	public void onTestSuccess(ITestResult result) {
	try {
ExtentReport_Test.extenttest.pass(result.getMethod().getMethodName() + " : " + "Test Pass" ,
	
			MediaEntityBuilder.createScreenCaptureFromPath(takesScreenshot()).build());
	}catch(IOException e) {
		e.printStackTrace();
	}
	}

	@Override
	public void onTestFailure(ITestResult result) {
		try {
		ExtentReport_Test.extenttest.fail(result.getMethod().getMethodName() + " : " + "Test Fail" ,
		
			MediaEntityBuilder.createScreenCaptureFromPath(takesScreenshot()).build());
		}catch(IOException e) {
			e.printStackTrace();
			}
}

	@Override
	public void onTestSkipped(ITestResult result) {
		
	}

	@Override
	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
	
	}

	@Override
	public void onTestFailedWithTimeout(ITestResult result) {
		
	}

	@Override
	public void onStart(ITestContext context) {
		
	}

	@Override
	public void onFinish(ITestContext context) {
		
	}

}
