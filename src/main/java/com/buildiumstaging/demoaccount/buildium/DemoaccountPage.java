package com.buildiumstaging.demoaccount.buildium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DemoaccountPage 
{
	WebDriver driver;
	DemoaccountPage(WebDriver d)
	{
		this.driver = d;
		PageFactory.initElements(d, this);
	}
	
	@FindBy(xpath = "/html/body/div[1]/div[1]/div/div/div/header/bd-global-nav/nav/div/ul/li[3]/bd-popover/a/popover-link/span")
	WebElement rentals;
	
	@FindBy(xpath="/html/body/div[1]/div[1]/div/div/div/header/bd-global-nav/nav/div/ul/li[4]/bd-popover/a/popover-link/span")
	WebElement communication;
	
	@FindBy(css = "#iconReports")
	WebElement report;
	
	@FindBy(css = "#lnk_Properties")
	WebElement property;
	
	@FindBy(xpath="//a[@id='lnk_Mailingand email templates']")
	WebElement mailingEmailTemplate;
	
	public WebElement getMailingEmailingTemplate()
	{
		return mailingEmailTemplate;
	}
	
	public WebElement getProperty()
	{
		return property;
	}
	
	public WebElement getReport()
	{
		return report;
	}
			
	public WebElement getRentals()
	{
		return rentals;
	}
	
	public WebElement getCommunication()
	{
		return communication;
	}
}
