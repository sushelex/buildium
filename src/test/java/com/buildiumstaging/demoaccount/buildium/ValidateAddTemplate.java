package com.buildiumstaging.demoaccount.buildium;

import java.io.IOException;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterClass;
import org.testng.annotations.Test;

public class ValidateAddTemplate extends Base
{
	@Test(dependsOnMethods="com.buildiumstaging.demoaccount.buildium.ValidateLogin.validateLogin")
	public void validateAddtemplate() throws IOException, InterruptedException
	{
		driver = initializeDriver();
		DemoaccountPage page = new DemoaccountPage(driver);
		page.getCommunication().click();
		page.getMailingEmailingTemplate().click();
		MailingAndEmailTemplates template = new MailingAndEmailTemplates(driver);
		Thread.sleep(5000);
		template.getAddTemplate().click();
		AddMailingAndEmailTemplate addTemplate =    new AddMailingAndEmailTemplate(driver);
		addTemplate.getTemplateName().sendKeys(p.getProperty("templateName"));
		addTemplate.getDescription().sendKeys(p.getProperty("description"));
		Thread.sleep(7000);
		addTemplate.getToken().click();
		driver.switchTo().frame(p.getProperty("frame"));
		WebDriverWait wait = new WebDriverWait(driver, 10);
		wait.until(ExpectedConditions.elementToBeClickable(addTemplate.getSelect()));
		Select select = new Select(addTemplate.getSelect());
		select.selectByIndex(19);
		driver.switchTo().defaultContent();
		wait.until(ExpectedConditions.elementToBeClickable(addTemplate.getOk()));
		addTemplate.getOk().click();
		addTemplate.getCreate().click();

	}

}
