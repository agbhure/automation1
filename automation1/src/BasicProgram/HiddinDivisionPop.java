package BasicProgram;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.decorators.WebDriverDecorator;
import org.openqa.selenium.support.ui.Select;

public class HiddinDivisionPop {
	public static void main(String[] args) {
	WebDriver driver=new ChromeDriver();
	

	
	
	
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	
	
	driver.get("https://www.careinsurance.com/rhicl/proposalcp/renew/index-care");
	driver.findElement(By.id("policynumber")).sendKeys("12345");
	driver.findElement(By.id("dob")).click();
	WebElement month = driver.findElement(By.xpath("//select[@class='ui-datepicker-month']"));
	Select s=new Select(month);
	s.selectByVisibleText("Apr");
WebElement year = driver.findElement(By.xpath("//select[@class='ui-datepicker-year']"));
Select s1=new Select(year);
s1.selectByValue("2023");
driver.findElement(By.linkText("30")).click();
driver.findElement(By.id("alternative_number")).sendKeys("9035523155");
driver.findElement(By.id("renew_policy_submit")).click();
WebElement errormsg = driver.findElement(By.id("policynumberError"));
boolean text = errormsg.isDisplayed();
if(text) {
	System.out.println("it is displayed and pass "+ text);
	
}
else
	System.out.println("it is not displayed and failed");

	
	
		
		
	}

}
