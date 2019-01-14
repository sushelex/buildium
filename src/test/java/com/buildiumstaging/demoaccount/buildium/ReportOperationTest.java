package com.buildiumstaging.demoaccount.buildium;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

public class ReportOperationTest extends Base 
{
	@Test(dependsOnMethods="com.buildiumstaging.demoaccount.buildium.ValidateLogin.validateLogin")
	public void validateReport() throws IOException
	{
		WebDriver driver = initializeDriver();
		DemoaccountPage demo = new DemoaccountPage(driver);
		demo.getReport().click();
		Reports report = new Reports(driver);
		report.getCurrentTenants().click();
		report.getExport();
		report.getPdfPortrait();
	}
}
