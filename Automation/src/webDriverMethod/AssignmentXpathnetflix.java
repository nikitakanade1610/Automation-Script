package webDriverMethod;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AssignmentXpathnetflix {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver =new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://www.netflix.com/login");
		//Thread.sleep(3000);
		driver.findElement(By.xpath("//input[@type='email']")).sendKeys("nikitanpatil1610@gmail.com");
		//Thread.sleep(3000);
		driver.findElement(By.xpath("//input[@type='password']")).sendKeys("12345");

	}

}
