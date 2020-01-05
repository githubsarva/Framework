package com.inetbanking.testCases;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.inetbanking.pageObjects.loginPage;

public class TC_LoginTest_001 extends BaseClass {
	
	@Test
	public void LoginTest() throws IOException
	{
		
		logger.info("URL is opned");
		loginPage lp= new loginPage(driver);
		lp.setUserName(username);
		logger.info("Entered the username");
		lp.setPassword(password);
		logger.info("Entered the password");
		
		
		lp.submit();
		logger.info("Submit button clicked");
		//System.out.println(driver.getTitle());
		
		if(driver.getTitle().equals("Guru99 Bank Manager HomePagekjkjkjk"))	{
		Assert.assertTrue(true);
		
		logger.info("Login test case pass");
		
	}
	else
	{
		captureScreen(driver,"LoginTest" );
		Assert.assertFalse(false);
		logger.info("Login test case fail");
	}
		
	}

}
