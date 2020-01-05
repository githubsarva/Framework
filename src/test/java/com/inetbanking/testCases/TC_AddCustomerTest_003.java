package com.inetbanking.testCases;

import java.io.IOException;

import org.apache.commons.lang3.RandomStringUtils;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.inetbanking.pageObjects.AddCustomerPage;
import com.inetbanking.pageObjects.loginPage;

public class TC_AddCustomerTest_003 extends BaseClass{
	@Test
	public void AddNewCustomer() throws InterruptedException, IOException{
		loginPage lp=new loginPage(driver);
		lp.setUserName(username);
		logger.info("User name provided");
		lp.setPassword(password);
		logger.info("Password provided");
		lp.submit();
		
		
		AddCustomerPage addcust=new AddCustomerPage(driver);
		addcust.NewCustomer();
		addcust.EnterCustomerName("Saravananl");
		addcust.SelectGender("male");
		addcust.dob("05", "13", "1990");
		Thread.sleep(3000);
		addcust.address("chennai");
		addcust.city("Chennai");
		addcust.state("Tamilnadu");
		addcust.pinno("555555");
		addcust.telephone("9942164921");
		
		String emai=randaonString()+"@gmail.com";
		addcust.email(emai);
		addcust.passwrd("123456");
		
		addcust.submit();
		Thread.sleep(3000);
		boolean res = driver.getPageSource().contains("Customer Registered Successfully!!!");
		
		if(res==true){
			Assert.assertTrue(true);
			logger.info("Test case passed");
		}else{
			captureScreen(driver, "AddNewCustomwe");
			Assert.assertTrue(false);
			logger.info("Test case failed");
		}
		}
	
	

}
