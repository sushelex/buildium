package com.buildiumstaging.demoaccount.buildium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AddPropertyPage 
{
	WebDriver driver;
	AddPropertyPage(WebDriver d)
	{
		this.driver=d;
		PageFactory.initElements(d, this);
	}
	
	@FindBy(css="#propertyType_innerSelectizeInput")
	WebElement propertyType;
	
	@FindBy(id="line1_vm.address")
	WebElement addLine1;
	
	@FindBy(id="line2_vm.address")
	WebElement addLine2;
	
	@FindBy(xpath="//input[@id='city_vm.address']")
	WebElement city;
	
	@FindBy(xpath="//div[@id='state_vm.address-dropdown']")
	WebElement state;
	
	@FindBy(xpath="//input[@id='zip_vm.address']")
	WebElement zip;
	
	@FindBy(xpath="//input[@id='operatingAccount_innerSelectizeInput']")
	WebElement operatingAccount;
	
	@FindBy(xpath="//input[@id='propertyReserve']")
	WebElement reserve;
	
	@FindBy(xpath="//button[@id='addProperty']")
	WebElement propertyBtn;
	
	public WebElement getPropertyBtn()
	{
		return propertyBtn;
	}
	
	public WebElement getReserve()
	{
		return reserve;
	}
	
	public WebElement getOperatingAccount()
	{
		return operatingAccount;
	}
	public WebElement getZip()
	{
		return zip;
	}
	
	public WebElement getState()
	{
		return state;
	}
	public WebElement getCity()
	{
		return city;
	}
	
	public WebElement getAddLine2()
	{
		return addLine2;
	}
	
	public WebElement getAddLine1()
	{
		return addLine1;
	}
	
	public WebElement getPropertyType()
	{
		return propertyType;
	}
}
