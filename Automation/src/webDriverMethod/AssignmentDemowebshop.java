package webDriverMethod;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AssignmentDemowebshop {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver =new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://demowebshop.tricentis.com/");
		//Thread.sleep(3000);
		WebElement e1=driver.findElement(By.className("ico-register"));
		e1.click();
		//Thread.sleep(3000);
		WebElement e2=driver.findElement(By.id("gender-female"));
		e2.click();
		WebElement e3=driver.findElement(By.id("FirstName"));
		e3.sendKeys("nikita");
		WebElement e4=driver.findElement(By.id("LastName"));
		e4.sendKeys("kanade");
		WebElement e5=driver.findElement(By.id("Email"));
		e5.sendKeys("nikitapatil@123gmail.com");
		WebElement e6=driver.findElement(By.id("Password"));
		e6.sendKeys("123456");
		WebElement e7=driver.findElement(By.id("confirm-Password"));
		e7.sendKeys("123456");

		WebElement e8=driver.findElement(By.id("register-button"));
		e8.click();
	}
}

		
		
		
		
	


