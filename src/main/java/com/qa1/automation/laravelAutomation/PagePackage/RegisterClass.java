package com.qa1.automation.laravelAutomation.PagePackage;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.qa1.automation.laravelAutomation.BasePackage.BaseClass;

public class RegisterClass extends BaseClass{
	
	@FindBy(xpath="//a[text()=\"Register\"]")
	WebElement registerlink;
	
	@FindBy(xpath="//input[@name=\"first_name\"]")
	WebElement fname;
	
	@FindBy(xpath="//input[@name=\"last_name\"]")
	WebElement lname;
	
	@FindBy(xpath="//input[@name=\"email\"]")
	WebElement email;
	
	@FindBy(xpath="//input[@name=\"password\"]")
	WebElement password;
	
	@FindBy(xpath="//input[@name=\"password_confirmation\"]")
	WebElement confirmpassword;
	
	@FindBy(xpath="//button[@type=\"submit\"]")
	WebElement submit;
	
	public RegisterClass() {
	PageFactory.initElements(driver, this);
	}
	
	public void clickonRegister() {
		registerlink.click();
	}
	
	public void enterfirstname(String firstname) {
		fname.sendKeys(firstname);
	}
	
	public void enterlastname(String lastname) {
		lname.sendKeys(lastname);
	}
	
	public void enteremail(String emailid) {
		email.sendKeys(emailid);
	}
	
	public void enterpassword(String pwd) {
		password.sendKeys(pwd);
	}
	
	public void enterconfirmpassword(String cpassword) {
		confirmpassword.sendKeys(cpassword);
	}
	
	public void clickonsubmit() {
		submit.click();
	}
	
	
	
	
	
	
	
	

}
