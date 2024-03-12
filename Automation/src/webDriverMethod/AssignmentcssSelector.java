package webDriverMethod;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AssignmentcssSelector {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver =new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://www.instagram.com");
		//Thread.sleep(3000);
		WebElement element1=driver.findElement(By.tagName("input"));
		element1.sendKeys("9730234127");
		//Thread.sleep(3000);
		WebElement element2=driver.findElement(By.cssSelector("[type='password']"));
		element2.sendKeys("password");
		//Thread.sleep(3000);
		WebElement element3=driver.findElement(By.cssSelector("[type='submit']"));
		element3.click();
		
		
		

	}

}
