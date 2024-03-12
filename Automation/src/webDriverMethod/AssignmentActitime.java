package webDriverMethod;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AssignmentActitime {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver =new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://127.0.0.1/login.do;jsessionid=1ugo8fb2dom3s");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//input[@name='username' and @type='text']]")).click();
		driver.findElement(By.xpath("//input[@type='password' and @name='pwd']]]")).click();
	}
	}


