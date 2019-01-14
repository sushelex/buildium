package com.buildiumstaging.demoaccount.buildium;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.Test;

public class ValidateLogin extends Base
{

	
	@Test
	public void validateLogin() throws IOException
		
	{
		driver = initializeDriver();
		driver.get(p.getProperty("url"));
		/*driver1.get(pp.getProperty("url"));*/
		SigninPage signin = new SigninPage(driver); 
		signin.getEmail().sendKeys(p.getProperty("username"));
		signin.getPassword().sendKeys(p.getProperty("password"));
		signin.getSigninBtn().click();
		
	}
	
	@AfterSuite
	public void getResult()
	{
		
		driver.get(System.getProperty("user.dir")+"\\test-output\\index.html");
	}
	

}
