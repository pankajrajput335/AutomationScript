package com.qa1.automation.laravelAutomation.ListenerPackage;

import org.testng.IRetryAnalyzer;
import org.testng.ITestResult;

public class IRetryAnalyzerClass implements IRetryAnalyzer{
	public int count=0;
	public int maxcount=2;
	
	public boolean retry(ITestResult result) {
		if(count<maxcount) {
			count++;
			return true;
		}
		return false;
		
	}
	
	

}
 