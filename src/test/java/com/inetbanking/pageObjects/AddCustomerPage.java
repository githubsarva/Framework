package com.inetbanking.pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AddCustomerPage {
	
	WebDriver ldriver;
	
	public AddCustomerPage(WebDriver rdriver) {
		
		ldriver = rdriver;
		PageFactory.initElements(rdriver, this);
		
	}
	
	@FindBy(xpath="/html/body/div[3]/div/ul/li[2]/a")
	WebElement ClickNewCustomer;
	
	@FindBy(name="name")
	WebElement Customername;
	
	@FindBy(name="rad1")
	WebElement Gender;
	
	@FindBy(id="dob")
	WebElement dob;
	
	@FindBy(name="addr")
	WebElement addr;
	
	@FindBy(name="city")
	WebElement city;
	
	@FindBy(name="state")
	WebElement state;
	
	@FindBy(name="pinno")
	WebElement pinno;
	
	@FindBy(name="telephoneno")
	WebElement telephoneno;
	

	@FindBy(name="emailid")
	WebElement emailid;
	
	@FindBy(name="password")
	WebElement password;
	
	@FindBy(name="sub")
	WebElement sub;
	
	public void NewCustomer(){
		ClickNewCustomer.click();
	}
	public void EnterCustomerName(String cname){
		Customername.sendKeys(cname);
	}
	public void SelectGender(String gender){
		Gender.click();
	}
	
	public void dob(String mm,String dd, String yyyy)
	{
		dob.sendKeys(mm);
		dob.sendKeys(dd);
		dob.sendKeys(yyyy);
	}
	
	
	public void address(String addrs){
		addr.sendKeys(addrs);
	}
	public void city(String cit){
		city.sendKeys(cit);
	}
	public void state(String sta){
		state.sendKeys(sta);
	}
	
	public void pinno(String pno){
		pinno.sendKeys(pno);
	}
	public void telephone(String tpno){
		telephoneno.sendKeys(tpno);
	}
	public void email(String emai){
		emailid.sendKeys(emai);
	}
	
	public void passwrd(String pwd){
		password.sendKeys(pwd);
	}
	
	public void submit(){
		sub.click();
	}
}
