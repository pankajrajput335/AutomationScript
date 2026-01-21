package com.qa1.automation.laravelAutomation.ListenerPackage;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.qa1.automation.laravelAutomation.UtilPackage.ExtentReportClass;
import com.qa1.automation.laravelAutomation.UtilPackage.TakeScreenshotClass;

public class TestListenerClass implements ITestListener{
	ExtentReports extent = ExtentReportClass.getReport();
    ThreadLocal<ExtentTest> test = new ThreadLocal<>();
    
    public void onTestStart(ITestResult result) {
    	ExtentTest extentTest=extent.createTest(result.getMethod().getMethodName());
    	test.set(extentTest);
    }
    
    public void onTestSuccess(ITestResult result) {
    	test.get().pass("Test paased");
    }
    
    public void onTestFailure(ITestResult resuld) {
    	test.get().fail("Test Failed");
    	test.get().addScreenCaptureFromPath(TakeScreenshotClass.takess());
    }
    
    public void onTestSkipped(ITestResult result) {
    	test.get().skip("Test Skipped");
    	
    }
    
    public void onFinish(ITestContext context) {
        extent.flush();   // ✅ MUST
    }
}
