package BasicProgram;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Properties;

public class HandlingPropertyFile {
	public static void main(String[] args) throws FileNotFoundException {
		FileInputStream fis=new FileInputStream("‪C:\\Users\\agbhu\\OneDrive\\Desktop\\data.property");
	
		Properties p=new Properties();
		String url=p.getProperty("url");
		String un=p.getProperty("username");
		String pw=p.getProperty("password");
		
		
		
		
		
	}

}
