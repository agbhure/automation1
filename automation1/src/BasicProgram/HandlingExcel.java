package BasicProgram;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandlingExcel {
	
	
	
	
	
	
	
	
	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		FileInputStream fis=new FileInputStream("‪C:\\Users\\agbhu\\OneDrive\\Desktop\\TestScript.xls");
		Workbook wb = WorkbookFactory.create(fis);

		String data = wb.getSheet("createcustomer").getRow(2).getCell(2).getStringCellValue();
		System.out.println(data);

		
	}

}
