package webDriverMethod;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.grid.Main;


public class automatenetflix2 {
	
	public static void main(String[] args) throws	InterruptedException {
	
		
	WebDriver driver =new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://www.netflix.com/in/Login");
	Thread.sleep(3000);
	 WebElement searchtextfield = driver.findElement(By.name("userLoginId"));
	searchtextfield.sendKeys("9730234127");
	Thread.sleep(3000);
	  WebElement password = driver.findElement(By.name("password"));
		password.sendKeys("Nikita@123");
		Thread.sleep(3000);
		 WebElement signin = driver.findElement(By.className("btn login-button btn-submit btn-small" ));
			signin.click();
	
	}

}
