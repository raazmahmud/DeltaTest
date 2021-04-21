package com.rsb.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

import com.rsb.qa.base.TestBase;

public class LoginPage extends TestBase{
	
	@Findby(name="email")		//a[@class = 'sign-up btn btn-link'
	WebElement login; 
	
	@Findby(name="pass")
	WebElement password;
	
	@Findby(name="login")
	WebElement loginButton;
	
	@Findby(name="fb_logo _8ilh img")
	WebElement image;
	
	
	
	public LoginPage() {
		PageFactory.initElements(driver, this);
	}
	
	//Actions or Different Features of LoginPage
	
	public String validateLoginPageTitle() {
		return driver.getTitle();
	}
	
	public HomePage login(String un, String pwd) {
		login.sendKeys(un);
		password.sendKeys(pwd);
		loginButton.click();
		
		return new HomePage();
	}

	

}
