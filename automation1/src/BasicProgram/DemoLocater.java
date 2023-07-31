package BasicProgram;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DemoLocater {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		
		
		
		
		
		
		
		driver.get("file:///C:/Users/agbhu/OneDrive/Desktop/demo.html");
		WebElement e = driver.findElement(By.id("d1"));
		e.click();
	}
}
