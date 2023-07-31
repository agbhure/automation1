package com.actitime.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class EnterTimeTrack {
	@FindBy(id="container_tasks")
	private WebElement task;
	
	@FindBy(id="logoutLink")
	private WebElement logout;
	
	public EnterTimeTrack(WebDriver driver) {
		PageFactory.initElements(driver,this);
	}
	public void setOfTask() {
		task.click();
		
		
	}
	public void logout() {
		logout.click();
		
		
	}
	

}
