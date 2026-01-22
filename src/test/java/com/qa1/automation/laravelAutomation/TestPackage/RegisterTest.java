package com.qa1.automation.laravelAutomation.TestPackage;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.qa1.automation.laravelAutomation.BasePackage.BaseClass;
import com.qa1.automation.laravelAutomation.PagePackage.RegisterClass;

public class RegisterTest extends BaseClass{
	RegisterClass register;
	
	@BeforeMethod
	public void setup() {
		driver.navigate().refresh();
		register=new RegisterClass();
	}
	
	@Test
	public void createUser() {
		register.clickonRegister();
		register.enterfirstname("Pankaj");
		register.enterlastname("Rajput");
		register.enteremail("test3434@gmail.com");
		register.enterpassword("Lucknow1@");
		register.enterconfirmpassword("Lucknow1@");
		register.clickonsubmit();
	}
	

}
