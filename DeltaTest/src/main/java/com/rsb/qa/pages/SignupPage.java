package com.rsb.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

import com.rsb.qa.base.TestBase;

public class SignupPage  extends TestBase{
	
	//Page Factory - Object Repository
	
	@Findby(name="signup")		//a[@class = 'sign-up btn btn-link'
	WebElement signup; 
	
	@Findby(name="password")
	WebElement password;
	/*
	@Findby(xpath="//img[contains(@class,'siteLogo']", name = "")
	WebElement deltaLogo;
	*/
	
	//Initializing all the elements with a constructor
	public SignupPage() {
		PageFactory.initElements(driver, this);
	}
	
	/*
	//Actions or Different Features of LoginPage
	
	public String validateLoginPageTitle() {
		return driver.getTitle();
	}
	
	public void signUp(String firstname, String lastName) {
		
	}
	*/
}
