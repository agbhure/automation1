package BasicProgram;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class MainMethodCls {
	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.get("https://demo.actitime.com/login.do");
		
		
		
		LogInpage l=new LogInpage(driver);
	
		
		
		l.setLogin("admin","manager");
	}

}
