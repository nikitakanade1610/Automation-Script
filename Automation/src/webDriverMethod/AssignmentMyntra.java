package webDriverMethod;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AssignmentMyntra {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver =new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.myntra.com");
		driver.findElement(By.xpath("//input[@class='desktop-searchBar']")).sendKeys("Jens",Keys.ENTER);
		Thread.sleep(2000);
		driver.findElement(By.xpath("//lable[text()='women']")).click();
		driver.findElement(By.xpath("")).click();
		//driver.findElement(By.xpath("//lable[text()='women']")).click();
		//driver.findElement(By.xpath("//lable[text()='women']")).click();

}
}