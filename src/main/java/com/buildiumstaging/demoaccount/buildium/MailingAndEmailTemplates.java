package com.buildiumstaging.demoaccount.buildium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class MailingAndEmailTemplates 
{
	WebDriver driver;
	MailingAndEmailTemplates(WebDriver d)
	{
		this.driver = d;
		PageFactory.initElements(d, this);
	}
	
	@FindBy(css="#add-template")
	WebElement addTemplate;
	
	public WebElement getAddTemplate() 
	{
		return addTemplate;
	}
}
