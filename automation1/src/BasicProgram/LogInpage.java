package BasicProgram;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LogInpage {
private WebElement utbtn;
private WebElement pwbtn;
private WebElement lgbtn;





public LogInpage(WebDriver driver) {
	utbtn=driver.findElement(By.id("username"));
	pwbtn=driver.findElement(By.name("pwd"));
	lgbtn=driver.findElement(By.xpath("//div[.='Login ']"));
	
}
public void setLogin(String un,String pw)
{
	utbtn.sendKeys(un);
	pwbtn.sendKeys(pw);
	lgbtn.click();
}
	
	
}



