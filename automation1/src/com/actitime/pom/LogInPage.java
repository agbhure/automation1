package com.actitime.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import bsh.This;

public class LogInPage {
	private static final Object This = null;

	@FindBy(id="username")
	private WebElement untbx;
	
	@FindBy(name="pwd")
	private WebElement pwtbx;
	
	@FindBy(xpath="//div[text()='Login ']")
	private WebElement lgbtn;
	
	public LogInPage(WebDriver driver) {
		PageFactory.initElements(driver,This);
	}
	public void setLogInPage(String un,String pw) {
		untbx.sendKeys(un);
		untbx.sendKeys(pw);
		untbx.click();
	}
	
	

}
