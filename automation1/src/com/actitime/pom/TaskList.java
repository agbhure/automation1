package com.actitime.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class TaskList {
	@FindBy(xpath="//div[text()='Add New']")
	private WebElement addnew;
	
	@FindBy(xpath="//div[text()='+ New Customer']")
	private WebElement newCustomer;
	
	@FindBy(xpath="//input[@placeholder='Enter Customer Name'and @class]")
	private WebElement custoemerName;
	
	@FindBy(xpath="//textarea[@placeholder='Enter Customer Description']")
	private WebElement Description;
	
	@FindBy(xpath="//div[@style='selectedItem'and@class='selectedItem']")
	private WebElement selectCustomer;
	
	@FindBy(xpath="//div[text()='Big Bang Company'and@class='text']")
	private WebElement BigBangcompany;
	
	@FindBy(xpath="//div[text()='Create Customer']")
	private WebElement CreateCustemer; 	

	
	public TaskList(WebDriver driver ) {
		PageFactory.initElements(driver,this);
	}


	public WebElement getAddnew() {
		return addnew;
	}


	public WebElement getNewCustomer() {
		return newCustomer;
	}


	public WebElement getCustoemerName() {
		return custoemerName;
	}


	public WebElement getDescription() {
		return Description;
	}


	public WebElement getSelectCustomer() {
		return selectCustomer;
	}


	public WebElement getBigBangcompany() {
		return BigBangcompany;
	}


	public WebElement getCreateCustemer() {
		return CreateCustemer;
	}
	
	

}
