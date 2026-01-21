package com.qa1.automation.laravelAutomation.UtilPackage;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import com.qa1.automation.laravelAutomation.BasePackage.BaseClass;

public class TakeScreenshotClass extends BaseClass{
	public static String takess() {
		 String timeStamp = new SimpleDateFormat("yyyy.MM.dd.HH.mm.ss").format(new Date());
		 String screenshotDir = System.getProperty("user.dir") + "/screenshots1/";
	       String filePath = screenshotDir + timeStamp + ".png";
	       try {
	           File dir = new File(screenshotDir);
	           if (!dir.exists()) {
	               dir.mkdirs();
	           }

		File src=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(src, new File(filePath));
	       } catch (IOException e) {
	           e.printStackTrace();
	       }
		   return filePath;

		
		
		
		
	}
	

}
