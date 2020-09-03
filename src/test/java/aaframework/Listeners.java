package aaframework;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;

import resources.Base;
import resources.ExtentReporterFR;

public class Listeners extends Base implements ITestListener{
	ExtentTest test;			// creating global variable for extent report
	ExtentReports extent = ExtentReporterFR.getExtentReport();
	
	// 1.1) adding threadlocal to handle to capture logs when multiple test are running in parallel
	ThreadLocal<ExtentTest> extentTest = new ThreadLocal<ExtentTest>();	
	
	@Override
	public void onTestStart(ITestResult result) {		
		test = extent.createTest(result.getMethod().getMethodName());   // this will get test method name as test name
		extentTest.set(test);   	// 1.2)  loading set into extentText
	}

	@Override
	public void onTestSuccess(ITestResult result) {
		// TODO Auto-generated method stub
		extentTest.get().log(Status.PASS, "Test Passed");	//	1.3) adding Threadlocal (to handle multiple test execution in parallel)

		}

	@Override
	public void onTestFailure(ITestResult result) {
		// This will capture screenshot on each test failure
		
		//	Extent report log recording
		extentTest.get().fail(result.getThrowable());			
		
		//Screenshot capture 
		WebDriver driver = null;
		
		try {
			// Following will give access to the field in test case where it got failed
			driver = (WebDriver)result.getTestClass().getRealClass().getDeclaredField("driver").get(result.getInstance());
		} catch (Exception e) {
			
		}
		/*
		// this will provide test method name.  We will pass this variable in takeScreenshot method in base.class
		String testMethodName = result.getMethod().getMethodName();  
		try {
			extentTest.get().addScreenCaptureFromPath(CaptureScreenshots(testMethodName, driver), result.getMethod().getMethodName());
		} catch (IOException e) {
			e.printStackTrace();
		} */
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
		extent.flush(); 
	}



}