package com.actitime.generic;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;

public class demo {
	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		FileLib f=new FileLib();
		String customerdata = f.geExecelData("createcustomer", 1, 3);
		
		System.out.println(customerdata);
	}
	
		
	
	
}

