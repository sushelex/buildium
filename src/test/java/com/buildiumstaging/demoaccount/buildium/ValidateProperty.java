package com.buildiumstaging.demoaccount.buildium;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

public class ValidateProperty extends Base
{
	@Test(dependsOnMethods="com.buildiumstaging.demoaccount.buildium.ValidateLogin.validateLogin")	
	public void addPropertyTest() throws IOException
	{
		driver = initializeDriver();
		DemoaccountPage demo = new DemoaccountPage(driver);
		demo.getRentals().click();
		demo.getProperty().click();
		PropertiesPage prop = new PropertiesPage(driver);
		WebDriverWait wait = new WebDriverWait(driver, 10);	
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='btn-addProperty']")));
		prop.getAddProperty().click();

		wait.until(ExpectedConditions.presenceOfElementLocated(By.cssSelector("#propertyType_innerSelectizeInput")));
		AddPropertyPage addproperty = new AddPropertyPage(driver);
		addproperty.getPropertyType().click();
		addproperty.getPropertyType().sendKeys(p.getProperty("propertyType"));
		addproperty.getPropertyType().sendKeys(Keys.TAB);
		addproperty.getAddLine1().sendKeys(p.getProperty("addLine1"));
		addproperty.getAddLine2().sendKeys(p.getProperty("addLine2"));
		addproperty.getCity().sendKeys(p.getProperty("city"));
		addproperty.getState().sendKeys(p.getProperty("state"));
		addproperty.getState().sendKeys(Keys.TAB);
		addproperty.getZip().sendKeys(p.getProperty("zip"));
		addproperty.getOperatingAccount().sendKeys("account");

		addproperty.getReserve().sendKeys(p.getProperty("reserve"));
		addproperty.getPropertyBtn().click();

	}


}
