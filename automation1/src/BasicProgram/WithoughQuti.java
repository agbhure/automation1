package BasicProgram;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import graphql.org.antlr.v4.runtime.tree.xpath.XPath;

public class WithoughQuti {
	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.get("https://secure.indeed.com/");
		
		
		
		
		
		
		
		driver.findElement(By.xpath("//span[text()='Continue with Apple']")).click();
		driver.findElement(By.xpath("//span[text()='Continue with Facebook']")).click();
		Set<String> allwh = driver.getWindowHandles();
		System.out.println(allwh);
		for(String wh:allwh) {
			driver.switchTo().window(wh);
			driver.close();
		}
			
		}

}
