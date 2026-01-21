package com.qa1.automation.laravelAutomation.UtilPackage;

import java.io.File;
import java.text.SimpleDateFormat;
import java.util.Date;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

public class ExtentReportClass {
	private static ExtentReports extent;
	public static ExtentReports getReport() {
		if (extent == null) {

            // Report path
            String timeStamp = new SimpleDateFormat("yyyy.MM.dd.HH.mm.ss").format(new Date());
            String reportDir = System.getProperty("user.dir") + "/test-output/";
            
            String reportPath = reportDir + "ExtentReport_" + timeStamp + ".html";
          
            File dir = new File(reportDir);
            if (!dir.exists()) {
                dir.mkdirs(); // create folder if missing
            }
            
            // Create reporter
            ExtentSparkReporter spark = new ExtentSparkReporter(reportPath);
           
            spark.config().setReportName("Automation Test Report");
            spark.config().setDocumentTitle("Selenium Test Results");
         // Attach reporter
            extent = new ExtentReports();
            extent.attachReporter(spark);

            // System info
            extent.setSystemInfo("Project", "Selenium Framework");
            extent.setSystemInfo("Tester", "Pankaj");
            extent.setSystemInfo("Browser", "Chrome");
		}
		return extent;
		
	
	}

}
