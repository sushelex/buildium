package com.buildiumstaging.demoaccount.buildium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PropertiesPage 
{
	WebDriver driver;
	PropertiesPage(WebDriver d)
	{
		this.driver=d;
		PageFactory.initElements(d, this);
	}
	
	@FindBy(xpath="//*[@id='btn-addProperty']")
	WebElement addProperty;
	
	
	
	public WebElement getAddProperty()
	{
		return addProperty;
	}
		
}
