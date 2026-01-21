package com.qa1.automation.laravelAutomation.BasePackage;

import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class BaseClass {
	
	public static WebDriver driver;
	public static Properties config;
	public static WebDriverWait wait;
	
	public void driverInitialize() {
		driver=new ChromeDriver();
		System.out.println(config.getProperty("URL"));
		driver.get(config.getProperty("URL").trim());
		driver.manage().window().maximize();
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(Integer.parseInt(config.getProperty("Time"))));
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(Integer.parseInt(config.getProperty("Time"))));
		driver.manage().deleteAllCookies();
		wait=new WebDriverWait(driver, (Duration.ofSeconds(Integer.parseInt(config.getProperty("Time")))));
	}
	
	public void readData() throws IOException {
		config=new Properties();
		FileInputStream ip=new FileInputStream("src/test/resources/property/config.Properties");
		config.load(ip);
	}
	
	

}
