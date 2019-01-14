package com.buildiumstaging.demoaccount.buildium;

public class Login 
{
	public void loginApplication()
	{
		SigninPage signin = new SigninPage();
		signin.getEmail().sendKeys("");
	}
}
