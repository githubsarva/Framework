package com.inetbanking.testCases;

import java.io.IOException;

import org.openqa.selenium.NoAlertPresentException;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.inetbanking.pageObjects.loginPage;
import com.inetbanking.utilities.XLUtils;

public class TC_loginDDT_002 extends BaseClass {
	
	@Test(dataProvider="LoginData")
	public void loginDDT(String user,String pwd) throws InterruptedException{
		
		loginPage lp= new loginPage(driver);
		
		lp.setUserName(user);
		logger.info("User name provided");
		lp.setPassword(pwd);
		logger.info("Password provided");
		lp.submit();
		logger.info("Click the submit button");
		Thread.sleep(3000);
		
		if(isAlertPresent()==true){
			driver.switchTo().alert().accept();
			driver.switchTo().defaultContent();
			Assert.assertTrue(false);
			logger.warn("Login failed");
		}else{
			Assert.assertTrue(true);
			logger.info("Login passed");
			Thread.sleep(3000);
			lp.logout();
			driver.switchTo().alert().accept();
			
			driver.switchTo().defaultContent();
			
		}
		
	}
	
	public boolean isAlertPresent()
	{
		try{
		driver.switchTo().alert();
		return true;
		}catch(NoAlertPresentException e){
			return false;
		}
		
	}
	@DataProvider(name="LoginData")
	String [][] getData() throws IOException{
		String path=System.getProperty("user.dir")+"/src/test/java/com/inetbanking/testData/LoginData.xlsx";
		int rownum=XLUtils.getRowCount(path, "Sheet1");
		int cocount=XLUtils.getCellCount(path, "sheet1", 1);
		String logindata[][]= new String[rownum][cocount];
		for(int i=1;i<=rownum;i++){
			for(int j=0;j<cocount;j++){
				
				logindata[i-1][j]=XLUtils.getCellData(path, "Sheet1", i, j);
				
			}
		}
		
		return logindata;
		
	}

}
