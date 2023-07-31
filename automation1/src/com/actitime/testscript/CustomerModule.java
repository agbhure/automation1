package com.actitime.testscript;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.testng.Reporter;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.actitime.generic.BaseClass1;
import com.actitime.generic.FileLib;
import com.actitime.pom.EnterTimeTrack;
import com.actitime.pom.TaskList;
@Listeners(com.actitime.generic.ListenerImplimentation.class)
public class CustomerModule extends BaseClass1{
	

	

	
	
	
	
	
	
	
@Test
public void testcreatecustomer() throws EncryptedDocumentException, IOException{
	
			FileLib f=new FileLib();
String customerName=f.getExecelData("createcustomer",1,3);
String customerDiscription = f.getExecelData("customerName",1,4);
Reporter.log("customerName",true);
EnterTimeTrack e=new EnterTimeTrack(driver);
e.setOfTask();
TaskList t=new TaskList(driver);
t.getAddnew();
t.getNewCustomer();
t.getCustoemerName().sendKeys(customerName);
t.getDescription().sendKeys(customerDiscription);
t.getSelectCustomer().click();
t.getBigBangcompany().click();
t.getCreateCustemer().click();
}
	
	}


