package com.qa1.automation.laravelAutomation.ListenerPackage;

import java.lang.reflect.Constructor;
import java.lang.reflect.Method;

import org.testng.IAnnotationTransformer;
import org.testng.annotations.ITestAnnotation;


public class IAnnotationTransformerClass implements IAnnotationTransformer{
	
	 @Override
	    public void transform(ITestAnnotation annotation,
	                          Class testClass,
	                          Constructor testConstructor,
	                          Method testMethod) {
	        // Apply retry to all @Test methods
	        annotation.setRetryAnalyzer(IRetryAnalyzerClass.class);
	    }

}
