package webDriverMethod;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WorkingWithForLoop {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.zomato.com/india");
		driver.findElement(By.xpath("//p[text()='Blinkit']")).click();
		WebElement location = driver.findElement(By.xpath("//input[@placrholder='search delivery location']"));
		Thread.sleep(2000);
		location.sendKeys("Qspiders pune wakad");
		Thread.sleep(2000);
		location.clear();
		Thread.sleep(1000);
		location.sendKeys("Qspiders pune wakad");
		driver.findElement(By.xpath("//div[contains(text(),'Qspiders pune wakad')]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[@href='/s/']")).click();
		
		
		
		


}
}