package BasicProgram;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertPopUp {
	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.get("https://demo.automationtesting.in/Alerts.html");
		
		
		
		
		
		
		
		driver.findElement(By.xpath("//button[@class='btn btn-danger']")).click();
		
		Alert alert = driver.switchTo().alert();
		String text=alert.getText();
		alert.accept();
		System.out.println(text);
		
	}

}
