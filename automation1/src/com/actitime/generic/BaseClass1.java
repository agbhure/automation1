package com.actitime.generic;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;

public class BaseClass1 {
	public static WebDriver driver;
	@BeforeClass
	public void openBrowser() {
	Reporter.log("openBrowser",true);
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
	driver.manage().window().maximize();
	}
	@AfterClass
	public void closueBrowser() {
	Reporter.log("closueBrowser",true);
	}
	@BeforeMethod
	public void logIn() {
	Reporter.log("logIn",true);
	
	}
	@BeforeClass
	public void logOut() {
	Reporter.log("logOut",true);
	}

}
