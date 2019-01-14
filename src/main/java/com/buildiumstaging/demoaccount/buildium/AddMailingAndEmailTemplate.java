package com.buildiumstaging.demoaccount.buildium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AddMailingAndEmailTemplate 
{
	WebDriver driver;
	AddMailingAndEmailTemplate(WebDriver d)
	{
		this.driver = d;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(css="select[name='ddlText']")
	WebElement select;
	
	@FindBy(css="#-dropdown")
	WebElement recipientType;
	
	@FindBy(css="#templateName")
	WebElement templateName;
	
	@FindBy(css="#templateDescription")
	WebElement description;
	
	@FindBy(xpath="//span[@class='cke_button_icon cke_button__tokens_icon']")
	WebElement token;
	
	@FindBy(css="#btnSave")
	WebElement create;
	
	@FindBy(css="#ddlText")
	WebElement dropdown;
	
	@FindBy(xpath="//span[text()='OK']")
	WebElement ok;
	
	public WebElement getOk()
	{
		return ok;
	}
	
	public WebElement getDropdown()
	{
		return dropdown;
	}
	public WebElement getSelect()
	{
		return select;
	}
	public WebElement getToken()
	{
		return token;
	}
	
	public WebElement getRecipientType()
	{
		return recipientType;
	}
	
	public WebElement getTemplateName()
	{
		return templateName;
	}
	
	public WebElement getDescription()
	{
		return description;
	}
	
	public WebElement getCreate()
	{
		return create;
	}
}
