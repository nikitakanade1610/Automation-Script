package webDriverMethod;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AssignmentFindElement {
	public static void main(String[] args) {
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		//Thread.sleep(2000);
		driver.get("https://www.myntra.com/");
		//Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@class='desktop-searchBar']")).sendKeys("T-shirts",Keys.ENTER);
		List<WebElement> productName = driver.findElements(By.className("product-brand"));
		
		for (WebElement name : productName) {
			System.out.println(name.getText());
			System.out.println("=================================");
		}
		driver.quit();


}
}