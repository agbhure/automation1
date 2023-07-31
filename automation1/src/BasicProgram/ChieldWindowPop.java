package BasicProgram;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ChieldWindowPop {
	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.get("https://secure.indeed.com/");

		
		
		
		
		
		
		
		
		driver.findElement(By.id("apple-signin-button")).click();
		driver.findElement(By.id("login-facebook-button")).click();
		Set<String> allwh = driver.getWindowHandles();
		System.out.println(allwh);
		for(String wh:allwh) {
			WebDriver title = driver.switchTo().window(wh);
			System.out.println(title);
			
		}
		driver.quit();
	}

}
