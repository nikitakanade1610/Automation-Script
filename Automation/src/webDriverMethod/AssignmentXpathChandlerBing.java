package webDriverMethod;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AssignmentXpathChandlerBing {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver =new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://www.google.com/search?q=chandler+bing&oq=&gs_lcrp=EgZjaHJvbWUqCQgAECMYJxjqAjIJCAAQIxgnGOoCMgkIARAjGCcY6gIyCQgCECMYJxjqAjIJCAMQIxgnGOoCMgkIBBAjGCcY6gIyCQgFECMYJxjqAjIPCAYQLhgnGMcBGOoCGNEDMgkIBxAjGCcY6gLSAQ05MjY3Mjk3NjNqMGo3qAIIsAIB&sourceid=chrome&ie=UTF-8");
		//Thread.sleep(3000);
		driver.findElement(By.xpath("//canvas[@class='lNPNe']")).click();
	}
}
