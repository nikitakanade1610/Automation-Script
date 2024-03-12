package webDriverMethod;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AssignmentDynamicXpath {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://tickets.paytm.com/");
		driver.findElement(By.xpath("//img[@src='//travel-assets-akamai.paytm.com/travel/mweb-flights/assets/7b29a32c.svg']")).click();
		driver.findElement(By.id("from")).click();
		driver.findElement(By.xpath("//img[@class='_3i2Wp']")).click();
		driver.findElement(By.xpath("//input[@class='_1X2Sn']")).sendKeys("PNQ");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[text()='Pune, Maharashtra, India']")).click();
		Thread.sleep(1000);
		driver.findElement(By.id("to")).click();
	    driver.findElement(By.xpath("//img[@class='_3i2Wp']")).click();
		driver.findElement(By.xpath("//input[@class='_1X2Sn']")).sendKeys("BOM");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[text()='Mumbai, Maharashtra, India']")).click();
		Thread.sleep(1000);
		driver.findElement(By.id("departureDate")).click();
		driver.findElement(By.xpath("(//div[text()='8'])[2]")).click();
		//click to search flight
		driver.findElement(By.xpath("//button[@id='flightSearch']")).click();
		Thread.sleep(5000);
		//fetch the price of first flight
		WebElement flightprice = driver.findElement(By.xpath("(//span[text()='Air India']/ancestor::div[@class='_5Cbbf'])[1]/descendant::div[@class='_2MkSl']"));
		System.out.println(flightprice.getText());
	}
}