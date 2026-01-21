package com.qa1.automation.laravelAutomation.TestPackage;

import java.io.IOException;

import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

import com.qa1.automation.laravelAutomation.BasePackage.BaseClass;

public class TestSetupClass extends BaseClass{
	
	@BeforeSuite
	public void initialize() throws IOException {
		readData();
		driverInitialize();
	}
	
	@AfterSuite
	public void close() {
		driver.quit();
	}

}
