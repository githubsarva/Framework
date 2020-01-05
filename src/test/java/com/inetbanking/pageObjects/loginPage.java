package com.inetbanking.pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class loginPage {
	
	WebDriver ldriver;
	
	public loginPage(WebDriver rdriver) {
		
		ldriver = rdriver;
		PageFactory.initElements(rdriver, this);
		
	}
@FindBy(name="uid")
WebElement txtUsername;

@FindBy(name="password")
WebElement txtPassword;

@FindBy(name="btnLogin")
WebElement btnLogin;

@FindBy(xpath="/html/body/div[3]/div/ul/li[15]/a")
WebElement logout;
public void setUserName(String uname){
	txtUsername.sendKeys(uname);
}
	public void setPassword(String pass){
		txtPassword.sendKeys(pass);
	}
		public void submit(){
			btnLogin.click();


}
		public void logout(){
			logout.click();
		}
}
